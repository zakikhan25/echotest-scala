name := "echotest-scala"

version := "0.3"

scalaVersion := "3.0.0-RC2"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "com.novocode"      %  "junit-interface" % "0.11"    % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.7"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.15.3"  % Test,
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.7.0" % Test
)
