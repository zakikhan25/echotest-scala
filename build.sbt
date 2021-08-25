name := "echotest-scala"

version := "0.3"

scalaVersion := "3.0.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-language:strictEquality")

libraryDependencies ++= Seq(
  "com.novocode"      %  "junit-interface" % "0.11"    % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.9"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.15.4"  % Test,
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % Test
)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
