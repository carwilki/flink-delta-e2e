import com.dbrx.dd.record.DDRecord
import com.sksamuel.avro4s.AvroOutputStream

import java.io.ByteArrayOutputStream

package object producer {
  implicit class DDRecordExtensions(record:DDRecord){
    def toAvro():Array[Byte] = {
      if (record == null) null else {
        val baos = new ByteArrayOutputStream()
        val avroOutputStream = AvroOutputStream.binary[DDRecord]
        val output = avroOutputStream.to(baos).build()
        output.write(record)
        output.close()
        baos.toByteArray
      }
    }
  }
}
