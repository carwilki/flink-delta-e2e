enablePlugins(JavaAppPackaging)
enablePlugins(UniversalPlugin)
enablePlugins(DockerPlugin)

packageName := "dd-generator"

Docker/packageName := "dd-generator"
Docker/version := "0.0.1"
dockerBaseImage := "adoptopenjdk/openjdk12:debian"
dockerExposedPorts ++= Seq.empty