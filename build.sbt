import Dependencies._

ThisBuild / scalaVersion     := "2.12.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.dbrx"
ThisBuild / organizationName := "dbrx"
ThisBuild / evictionErrorLevel :=  util.Level.Warn
ThisBuild / assemblyMergeStrategy:={
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

lazy val root = (project in file("."))
  .aggregate(writer, generator,shared)

lazy val shared = project.settings(
  libraryDependencies ++= Seq(
    scalaCheckFaker,scalaTest,
    "com.sksamuel.avro4s" %% "avro4s-core" % "4.1.0"
  )
)

lazy val deltaConnectorsVersion = "0.5.1-SNAPSHOT"
lazy val flinkVersion = "1.14.5"
lazy val hadoopVersion = "3.1.0"

lazy val writer = project.settings(
  assembly / assemblyJarName := "flink-doordash-delta-writer.jar",
  assembly / mainClass := Some("writer.FlinkToDeltaWriter"),
  libraryDependencies ++= Seq(
    scalaTest,
    javax,
    typesafe,
    "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
    "org.apache.flink" %% "flink-parquet" % flinkVersion,
    "org.apache.flink" %% "flink-connector-kafka" % flinkVersion,
    "org.apache.flink" % "flink-avro" % flinkVersion,
    "org.apache.hadoop" % "hadoop-client" % hadoopVersion,
    "org.apache.flink" % "flink-s3-fs-hadoop" % flinkVersion % "provided",
    "org.apache.flink" % "flink-table-common" % flinkVersion,
    "org.apache.flink" %% "flink-table-api-scala-bridge" % flinkVersion,
    "org.apache.flink" %% "flink-table-runtime" % flinkVersion,
    "org.apache.flink" %% "flink-parquet" % flinkVersion % "provided",
    "org.apache.hadoop" % "hadoop-aws" % hadoopVersion,
    "io.delta" %% "delta-standalone" % "0.5.0",
    "ch.qos.logback" % "logback-classic" % "1.2.10")
).dependsOn(shared)

lazy val generator = project.settings(
  libraryDependencies ++= Seq(
    scalaTest,
    javax,
    typesafe,
    monix,
    "ch.qos.logback" % "logback-classic" % "1.2.10"
  ),
  dependencyOverrides +=kafkaOverride
).dependsOn(shared)