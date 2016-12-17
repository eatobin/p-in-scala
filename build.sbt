name := """p-in-scala"""

version := "1.0"

scalaVersion := "2.12.0"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.14",
  "io.spray" %% "spray-json" % "1.3.2"
)
