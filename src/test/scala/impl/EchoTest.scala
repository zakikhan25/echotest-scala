package edu.luc.cs.cs372.echo.impl

import org.scalatest.FunSuite

class EchoTest extends FunSuite {

  test("A simple echo should echo an empty argument") {
    assert((new SimpleEcho).echo("") == "")
  }

  test("A simple echo should echo a nonempty argument") {
    assert((new SimpleEcho).echo("hello") == "hello")
  }

  test("A double echo should echo twice an empty argument") {
    assert((new DoubleEcho).echo("") == " ")
  }

  test("A double echo should echo twice a nonempty argument") {
    assert((new DoubleEcho).echo("hello") == "hello hello")
  }

}