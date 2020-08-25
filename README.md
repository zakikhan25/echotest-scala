# Overview

Very simple example including an App and a few tests 
(illustrating different testing styles).

# Running the app

    sbt run

# Running the tests

    sbt test

# Determining test coverage

    sbt coverage test
    sbt coverageReport
	
Now open this file in a web browser:

    target/scala-2.13/scoverage-report/index.html
    
# Running a Scala console

This allows you to explore the functionality of the classes in this
project in a Scala REPL while letting sbt set the classpath for you.

    sbt console
