package org.ftts

import org.scalatest.{Matchers, FreeSpec}

/**
 * Created by russel on 3/20/15.
 */
class PatternSpec extends FreeSpec with Matchers {

  "Scala pattern matching" - {
    "can be applied in a match expression" - {
      "using the widlcard pattern" in {
        def pm(a: Any) = a match {
            // match any value and discard the match
          case _ => "It's something"
        }
        pm("Scala") shouldBe "It's something"
        pm(1234) shouldBe "It's something"
      }
      "using the variable pattern" in {
        def pm(a: Any) = a match {
            // match any value and attach to m
          case m => s"It is $m"
        }
        pm("Scala") shouldBe "It is Scala"
        pm(1234) shouldBe "It is 1234"
      }
      "using the variable pattern with a type annotation" in {
        def pm(a: Any) = a match {
          case m: String => s"It is $m"
          case i: Int => s"Int is $i"
          case _ => "It is something"
        }
        pm("Scala") shouldBe "It is Scala"
        pm(1234) shouldBe "Int is 1234"
        pm(2.302) shouldBe "It is something"
      }
      "using the constant pattern" in {
        object Foo {
          val pi = 3.14
        }
          val laptop = "MacBook"
        def pm(a: Any) = a match {
          case "Scala" => "It is Scala"
          case `laptop` => "Its an Apple"  // `var` outside of scope
          case _ => "Unknown"
        }
        pm("Scala") shouldBe "It is Scala"
        pm("MacBook") shouldBe "Its an Apple"
        pm("foo") shouldBe "Unknown"
      }
    }
    "using the constructor pattern" in {
      case class Point(x: Int, y: Int)
      def pm(a: Any) = a match {
        case Point(0,0) => "origin"
        case Point(j,0) => s"at $j on the x-axis"
        case Point(0,_) => "somewhere on teh y-axis"
        case _ => "whatever"
      }
      pm(Point(0,0)) shouldBe "origin"
      pm(Point(3,0)) shouldBe "at 3 on the x-axis"
      pm(Point(10,10)) shouldBe "whatever"
    }
    "can use constructor pattern with tuples" in {
      def pm(a: Any) = a match {
        case (a,b) => s"$a and $b"
        case (a,b,c) => s"a and $b and $c"
        case (_,_,_,d) => s"Tuple4 with $d"
      }
      pm((1,2)) shouldBe "1 and 2"
    }
    "can use constructor pattern with collections" in {
      def pm(a: Any) = a match {
        case Seq(1,2,3) => "1-3"
        case _ => "unknown"
      }
      pm(Seq(1,2,3)) shouldBe "1-3"
      pm(Seq.empty) shouldBe "unknown"
    }

    "can be applied in variable assignment" - {
      "to extract tuples values" in {
        val p1 = (3,5)
        val (a,b) = p1
        a shouldBe 3
        b shouldBe 5

        val (_,c) = p1
        c shouldBe 5
      }
      "but watch out for trouble" in {
        val p1: Any = (3,5)
        a [MatchError] shouldBe thrownBy {
          val (a,b,c) = p1
        }
      }
    }
    "can be used in generators to extract tuple values" in {
      val points = (0 to 9).map(i => (i,i))
      val r = for {
        (x,y) <- points
      } yield x + y
      r shouldBe Seq(0,2,4,6,8,10,12,14,16,18)
    }
    // partialFunction is a mapping from one type to another where not all parts are supported
    "applies anytime a PartialFunction[T, U] is expected" in {
      val pf: PartialFunction[Any, String] = {
        case ms: String => s"The message is $ms"
      }
      pf("secret") shouldBe "The message is secret"
      an [MatchError] shouldBe thrownBy {
        pf(123)
      }
    }
  }

}
