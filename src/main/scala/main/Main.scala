package edu.luc.cs.cs372.echo
package main

object Main extends App {
  val echos = Seq(new impl.SimpleEcho, new impl.DoubleEcho)
  for (e <- echos) {
    println(e.echo("hello"))
  }
}
