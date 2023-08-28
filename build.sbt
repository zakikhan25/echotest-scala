name := "echotest-scala"

version := "0.3"

scalaVersion := "3.3.0"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "com.novocode"      %  "junit-interface" % "0.11"    % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.16"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.17.0"  % Test,
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.16.0" % Test
)
