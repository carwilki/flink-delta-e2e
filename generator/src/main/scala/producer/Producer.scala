package producer

import com.dbrx.dd.record.RecordGenerator
import com.typesafe.scalalogging.LazyLogging
import monix.eval.Task
import monix.execution.Scheduler
import monix.execution.atomic.Atomic
import monix.kafka._

import scala.collection.JavaConverters._

object Producer extends App with LazyLogging {
  implicit val scheduler: Scheduler = monix.execution.Scheduler.global
  val count = Atomic(0)
  val producerCfg = KafkaProducerConfig.default.copy(
    bootstrapServers = List(System.getenv().asScala.getOrElse("KAFKA_BROKER","localhost:9092"))
  )
  val kafkaProducer = KafkaProducer[String, Array[Byte]](producerCfg, scheduler)

  val runLoop = Task{while(true){
    val record = RecordGenerator.next()
    kafkaProducer.send("dd-test-topic",record.IDEMPOTENCY_KEY,record.toAvro())
      .runAsync {
        case Left(e) => logger.error("an error occurred publishing to kafka",e)
        case Right(value) => logger.info(s"message published. Total published count:${count.incrementAndGet(1)}")
      }
  }}

  val cancelToken = runLoop
    .runAsync {
      case Left(e) => logger.error("error in main loop",e)
      case Right(b) => logger.info("application exiting")
    }

  scala.io.StdIn.readLine()
  cancelToken.cancel()
}