name := "echotest-scala"

version := "0.3"

scalaVersion := "3.1.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-language:strictEquality")

libraryDependencies ++= Seq(
  "com.novocode"      %  "junit-interface" % "0.11"    % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.13"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.16.0"  % Test,
  "org.scalatestplus" %% "scalacheck-1-16" % "3.2.13.0" % Test
)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
