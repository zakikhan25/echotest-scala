package edu.luc.cs.cs372.echo.impl

import org.scalatest.FunSuite
import org.scalatest.prop.Checkers
import org.scalacheck.Prop._

/**
 * Property-based testing in ScalaTest using the Checkers mixin
 * (preferred over using ScalaCheck directly).
 */
class EchoCheck extends FunSuite with Checkers {

  val simpleEcho = new SimpleEcho

  val doubleEcho = new DoubleEcho

  test("A simple echo should echo a nonempty argument") {
    check { (a: String) =>
      simpleEcho.echo(a) == a
    }
  }

  test("A double echo should echo twice a nonempty argument") {
    check { (a: String) =>
      doubleEcho.echo(a) == a + " " + a
    }
  }

}