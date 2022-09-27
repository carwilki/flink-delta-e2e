enablePlugins(JavaServerAppPackaging)
enablePlugins(UniversalPlugin)
enablePlugins(DockerPlugin)

packageName := "dd-writer"

Docker/packageName := "dd-writer"
Docker/version := "0.0.1"
dockerBaseImage := "flink:latest"
dockerExposedPorts ++= Seq.empty