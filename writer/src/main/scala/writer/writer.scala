package writer

import com.dbrx.dd.record._
import io.delta.flink.sink.DeltaSink
import org.apache.flink.api.common.eventtime.WatermarkStrategy
import org.apache.flink.api.common.functions.RichMapFunction
import org.apache.flink.api.common.serialization.DeserializationSchema
import org.apache.flink.configuration.{Configuration => FConfig}
import org.apache.flink.connector.kafka.source.KafkaSource
import org.apache.flink.connector.kafka.source.enumerator.initializer.OffsetsInitializer
import org.apache.flink.core.fs.Path
import org.apache.flink.formats.avro.AvroRowDeserializationSchema
import org.apache.flink.formats.avro.typeutils.AvroSchemaConverter
import org.apache.flink.streaming.api.scala._
import org.apache.flink.table.data.RowData
import org.apache.flink.table.data.conversion.RowRowConverter
import org.apache.flink.table.types.logical.RowType
import org.apache.flink.table.types.{DataType, FieldsDataType}
import org.apache.flink.types.Row
import org.apache.hadoop.conf.{Configuration => HDConfig}
import org.apache.hadoop.fs.LocalFileSystem
import org.apache.hadoop.hdfs.DistributedFileSystem
import org.apache.kafka.clients.consumer.OffsetResetStrategy

import scala.collection.JavaConverters._

object FlinkToDeltaWriter extends App {
  class ConvertRowToRowDataMapFunction(fieldsDataType: FieldsDataType)
    extends RichMapFunction[Row, RowData] {
    private final val rowRowConverter = RowRowConverter.create(fieldsDataType)

    override def open(parameters: FConfig): Unit = {
      super.open(parameters)
      rowRowConverter.open(this.getClass.getClassLoader)
    }

    override def map(row: Row): RowData =
      this.rowRowConverter.toInternal(row)
  }

  def createStandAloneDeltaSink(stream: DataStream[RowData], deltaTablePath: String,rowType:RowType): DeltaSink[RowData] = {
    val configuration = new HDConfig()
    configuration.set("fs.hdfs.impl", classOf[DistributedFileSystem].getName)
    configuration.set("fs.file.impl", classOf[LocalFileSystem].getName)
    configuration.set("fs.s3a.access.key",
      System.getenv.asScala.getOrElse("FLINK_S3_ACCESS_KEY",throw new Exception("no FLINK_S3_ACCESS_KEY in env")))
    configuration.set("fs.s3a.secret.key",
      System.getenv.asScala.getOrElse("FLINK_S3_SECRET_KEY",throw new Exception("no FLINK_S3_ACCESS_KEY in env")))
    configuration.set("spark.hadoop.fs.s3.access.key",
      System.getenv.asScala.getOrElse("FLINK_S3_ACCESS_KEY",throw new Exception("no FLINK_S3_ACCESS_KEY in env")))
    configuration.set("spark.hadoop.fs.s3.secret.key",
      System.getenv.asScala.getOrElse("FLINK_S3_SECRET_KEY",throw new Exception("no FLINK_S3_SECRET_KEY in env")))
    configuration.set("spark.hadoop.fs.s3a.aws.credentials.provider",
      "com.amazonaws.auth.profile.ProfileCredentialsProvider")

    DeltaSink.forRowData(new Path(deltaTablePath), configuration,rowType).build()
  }

  def createKafkaSource(brokers:String,topic:String,groupId:String): KafkaSource[Row] = {
    KafkaSource.builder[Row]
      .setBootstrapServers(brokers)
      .setTopics(topic)
      .setGroupId(groupId)
      .setStartingOffsets(OffsetsInitializer.committedOffsets(OffsetResetStrategy.LATEST))
      .setValueOnlyDeserializer(new AvroRowDeserializationSchema(DDRecord.SCHEMA$.toString).asInstanceOf[DeserializationSchema[Row]]).build()
  }

  val deltaTablePath = "s3a://dd-delta-test/delta-1/"
  val dt: DataType = AvroSchemaConverter.convertToDataType(DDRecord.SCHEMA$.toString)
  val env: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
  env.enableCheckpointing(30000)

  val fts: FieldsDataType = new FieldsDataType(dt.getLogicalType,dt.getChildren)
  val ks: KafkaSource[Row] = createKafkaSource("kafka1:19092","dd-test-topic","dd-cg-1")
  val kds: DataStream[Row] = env.fromSource(ks,WatermarkStrategy.noWatermarks(),"kafka-dd-test")
  val rcs: DataStream[RowData] = kds.map(new ConvertRowToRowDataMapFunction(fts)).broadcast
  val ds: DeltaSink[RowData] = createStandAloneDeltaSink(rcs,deltaTablePath,dt.getLogicalType.asInstanceOf[RowType])
  rcs.sinkTo(ds)
  env.execute("delta sync")
}
