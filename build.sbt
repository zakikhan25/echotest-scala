name := "echotest-scala"

version := "0.2"

scalaVersion := "2.13.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.2"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.14.3"  % Test,
  "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0" % Test
)
