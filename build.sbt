name := "SparkApp"

version := "0.1"

scalaVersion := "2.12.10"
autoScalaLibrary:=false
val sparkVersion = "3.0.0-preview2"
//resolvers += "MavenRepository" at "https://mvnrepository.com"
val sparkDependencies= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

val testDependencies=Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
//resolvers +="https://mvnrepository.com/"
libraryDependencies ++=sparkDependencies ++ testDependencies
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
//libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.0-preview2"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.0-preview2"
