name := "echotest-scala"

version := "0.4"

scalaVersion := "3.4.2"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "com.lihaoyi"       %% "mainargs"        % "0.6.3",
  "com.novocode"      %  "junit-interface" % "0.11"     % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.19"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.18.0"   % Test,
  "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0" % Test
)

enablePlugins(JavaAppPackaging)
