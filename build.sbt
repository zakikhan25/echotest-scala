name := "echotest-scala"

version := "0.1"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test",  // required only for plain JUnit testing
  "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

// enable scoverage
instrumentSettings
