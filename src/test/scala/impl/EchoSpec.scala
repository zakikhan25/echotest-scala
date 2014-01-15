package edu.luc.cs.cs372.echo.impl

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object EchoSpec extends Properties("Echo") {

  val simpleEcho = new SimpleEcho

  val doubleEcho = new DoubleEcho

  property("simpleEcho") = forAll { (a: String) =>
    simpleEcho.echo(a) == a
  }

  property("doubleEcho") = forAll { (a: String) =>
    doubleEcho.echo(a) == a + " " + a
  }
}