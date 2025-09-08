package edu.luc.cs.cs371.echo.impl

import org.junit.*
import Assert.*
import java.io.{ByteArrayOutputStream, PrintStream}
import scala.jdk.CollectionConverters.*

/**
 * Plain JUnit testing without ScalaTest.
 *
 * Alternatively, one can use
 * [[http://www.scalatest.org/getting_started_with_junit_4_in_scala JUnit with ScalaTest]]
 */
class EchoJUnit:

  @Test def testSimpleEmpty: Unit =
    assertEquals("", (new SimpleEcho).echo(""))

  @Test def testSimpleNonempty: Unit =
    assertEquals("hello", (new SimpleEcho).echo("hello"))

  @Test def testDoubleEmpty: Unit =
    assertEquals(" ", (new DoubleEcho).echo(""))

  @Test def testDoubleNonempty: Unit =
    assertEquals("hello hello", (new DoubleEcho).echo("hello"))

  
  @Test def testSimpleUsingList: Unit =
    val echos = List(new SimpleEcho)
    val result = echos(0).echo("")
    assertEquals("", result)

  @Test def testSimpleAlsoUsingList: Unit =
    val echos = List(new SimpleEcho)
    try
      val result = echos(1).echo("")
      fail("should have gotten an IndexOutOfBoundsException by now!")
    catch
      case _: IndexOutOfBoundsException => // all good

  @Test def testMainEndToEnd: Unit =
    val ba = new ByteArrayOutputStream
    val os = new PrintStream(ba)
    System.setOut(os)
    main.Main.main(Array.empty[String])
    import scala.language.unsafeNulls
    val lines = ba.toString.lines.toList.asScala
    assertEquals("hello", lines(0))
    assertEquals("hello hello", lines(1))

  @Test def testInteractiveEndToEnd: Unit =
    fail("NYI")

end EchoJUnit
