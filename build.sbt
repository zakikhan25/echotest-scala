name := "echotest-scala"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,  // required only for plain JUnit testing
  "org.scalatest" %% "scalatest" % "2.2.6" % Test,
  "org.scalacheck" %% "scalacheck" % "1.12.5" % Test
)
