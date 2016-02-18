package org.ftts

import org.scalatest._

/**
 * Created by russel on 3/19/15.
 */
class ClassSpec extends FreeSpec with Matchers {
   "Scala classes" - {
     "are defined with class keyword" in {
       class Simple
     }
     "are instantiated with the new keyword" in {
       class Simple
       val s = new Simple
       s shouldBe a[Simple] // shouldBe a type of Simple
     }
     "can have class parameters" in {
       class Point(x: Int, y: Int)
       val p = new Point(10, 20)
       p shouldBe a[Point]
     }
     "can have auxillary constructors" in {
       class Point(x: Int, y: Int) {
         def this() = this(0, 0)
         def this(x: Int) = this(x, 10)
       }
       val p = new Point()
       val q = new Point(5)
       p shouldBe a[Point]
     }
     "can contain immutable fields" in {
       class Point {
         val x = 50
         val y = 0
       }
       val p = new Point
       p.x shouldBe 50
       p.y shouldBe 0
     }
     "can contain mutable fields" in {
       class Point {
         var x = 50
         var y = 0
       }
       val p = new Point
       p.x shouldBe 50
       p.y shouldBe 0
       p.x = 30
       p.x shouldBe 30
     }
     "can promote class parameters to immutable fields" in {
       class Point(val x: Int, val y: Int)
       val p = new Point(5, 10)
       p.x shouldBe 5
       p.y shouldBe 10
     }


     "can have methods defined with the def keyword" - {
       "which are public by default" in {
         class Point(val x: Int, val y: Int) {
           def swap: Point = new Point(y,x)
         }
         val p = new Point(5, 10)
         val q = p.swap
         q.x shouldBe 10
         q.y shouldBe 5
       }
       "which can have a parameter list" in {
         class Point(val x: Int, val y: Int) {
           def slopeFrom(other: Point): Double = (this.y - other.y) / (this.x - other.x).toDouble
         }
         val p = new Point(20, 10)
         val q = new Point(0, 0)
         p.slopeFrom(q) shouldBe 0.5
       }
       "which can have a symbolic name" in {
         class Point(val x: Int, val y: Int) {
           def +(other: Point): Point = new Point(x + other.x, y + other.y)
         }
         val p1 = new Point(5, 10)
         val p2 = new Point(4, 8)
         val q = p1 + p2
         q.x shouldBe 9
         q.y shouldBe 18
       }
       "which can have default values" in {
         class Point(val x: Int, val y: Int) {
           def slope(other: Point = new Point(0, 0)): Double = (y - other.y) / (x - other.x).toDouble
         }
         val p = new Point(20, 10)
         p.slope() shouldBe 0.5
         p.slope(new Point(10, 5)) shouldBe 0.5
       }
       "which can be private" in {
         class Point(val x: Int, val y: Int) {
           private def calcSlope(x: Int, y: Int): Double = (y - y) / (x - x).toDouble
           def slope(other: Point = new Point(0, 0)): Double = (y - other.y) / (x - other.x).toDouble
         }
         val p = new Point(20, 10)
         p.slope(new Point(0, 0)) shouldBe 0.5
       }
       "are brought into scope with import" - {
         "for a single member" in {
           import scala.util.Try
           Try(1+1).get shouldBe 2
         }
         "for multiple members from a single package" in {
           import scala.util.{Try, Success}
           Try(1+1) shouldBe Success(2)
         }
         "which can rename member" in {
           import scala.util.{Try => MightWork, Success => Coolio}
           MightWork(1+1) shouldBe Coolio(2)
         }
         "for all the members in a package" in {
           import scala.util._
           Try(1+1) shouldBe Success(2)
         }
         "which can also bring instnce members into scope" in {
           class Point(val x: Int, val y: Int)
           val p = new Point(10, 30)
           import p._
           x + y shouldBe 40
         }
       }
     }
   }
  "Scala singelton objects" - {
    "are defined with the object keyword" in {
      object Point
    }
    "can contain methods and fields" in {
      class Point(val x: Int, val y: Int)
      object Point {
        val Origin = new Point(0,0)
        def slope(pt1: Point, pt2: Point): Double = (pt2.y - pt1.y) / (pt2.x - pt1.x).toDouble
      }
      Point.Origin.x shouldBe 0
      Point.Origin.y shouldBe 0
    }
    "include Predef, whose members are automatically imported" in {
      class Point(val x: Int, val y: Int) {
        require(x >= 0, "x must be positive")
        require(y >= 0, "y must be positive")
      }
      an [IllegalArgumentException] shouldBe thrownBy {
        val p = new Point(-5, 5)
      }
      val a = 6
      require(a > 5, "a must be greater than 5")
    }
  }
}
