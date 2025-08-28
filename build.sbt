name := "echotest-scala"

version := "0.4"

libraryDependencies ++= Seq(
  "com.lihaoyi"       %% "mainargs"        % "0.7.6",
  "com.novocode"      %  "junit-interface" % "0.11"     % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.19"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.18.1"   % Test,
  "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0" % Test
)

enablePlugins(JavaAppPackaging)
