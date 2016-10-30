name := "sparksamples"

version := "1.0"

scalaVersion := "2.10.4"

val sparkVersion="1.4.0"
val log4jVersion="1.2.14"
val junitInterfaceVersion="0.11"
val scalaTestVersion="2.2.4"

libraryDependencies ++= Seq(
  //"org.apache.spark" % "spark-core_2.10" % "1.4.0"
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion
)

resolvers ++= Seq(
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases" ,
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)
