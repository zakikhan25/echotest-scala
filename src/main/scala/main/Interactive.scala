package edu.luc.cs.cs371.echo
package main

import edu.luc.cs.cs371.echo.impl.{DoubleEcho, SimpleEcho}
import mainargs.{Flag, ParserForMethods, arg, main}

/** Typesafe equality instance to help with readLine. */
given CanEqual[String | Null, Null] = CanEqual.derived

object Interactive:

  val promptString = "Enter a message to echo (EOF to exit) >"

  // internal main method with arguments annotated for parsing
  @main
  def run(
      @arg(short = 'd', doc = "double echo") doubleEcho: Flag,
      @arg(short = 'p', doc = "enable input prompts") prompt: Flag
  ) =
    val echo = if doubleEcho.value then new DoubleEcho else new SimpleEcho
    if prompt.value then
      print(promptString)
    var line: String | Null = scala.io.StdIn.readLine()
    while line != null do
      println(echo.echo(line))
      // terminate on I/O error such as SIGPIPE
      if scala.sys.process.stdout.checkError() then
        sys.exit(1)
      if prompt.value then
        print(promptString)
      line = scala.io.StdIn.readLine()

  // external entry point into Scala application
  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args.toIndexedSeq)
    ()

end Interactive
