package main

import edu.luc.cs.cs371.echo.impl.*

object Main:
  def main(args: Array[String]): Unit =
    val echos = Seq(new SimpleEcho, new DoubleEcho)
    for e <- echos do
      println(e.echo("hello"))
end Main
