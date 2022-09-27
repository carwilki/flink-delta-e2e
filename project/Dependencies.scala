import sbt._

object Dependencies {
  //Test Deps
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"

  lazy val scalaCheckFaker =  "io.github.etspaceman" %% "scalacheck-faker" % "7.0.0"

  lazy val jackson = "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.5"
  lazy val javax = "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1" artifacts (Artifact("javax.ws.rs-api", "jar", "jar"))
  lazy val typesafe =  "com.typesafe" % "config" % "1.3.2"
  lazy val monix = "io.monix" %% "monix-kafka-1x" % "1.0.0-RC6"
  lazy val kafkaOverride =  "org.apache.kafka" % "kafka-clients" % "2.1.0"
}
