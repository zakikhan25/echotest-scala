package edu.luc.cs.cs371.echo.impl

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
 * Property-based testing using ScalaCheck directly.
 */
object EchoSpec extends Properties("Echo"):

  val simpleEcho = new SimpleEcho
  val doubleEcho = new DoubleEcho

  property("simpleEcho") = forAll: (a: String) =>
    simpleEcho.echo(a) == a

  property("doubleEcho") = forAll: (a: String) =>
    doubleEcho.echo(a) == a + " " + a
end EchoSpec
