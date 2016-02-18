package org.ftts

import org.scalatest.{Matchers, FreeSpec}

/**
 * Created by russel on 3/20/15.
 */

class ForSpec extends FreeSpec with Matchers {
  val nums = Vector(1, 2, 3)

  "For loops" - {
    "are of the form for (elem <- coll) expr" in {

      /** elem = local var to bind each element into  */
      /** coll = collection */
      /** expr = expression to evaluate for each item  */

      val builder = new StringBuilder()
      for (n <- nums) {
        builder.append(n.toString)
      }
      builder.toString shouldBe "123"
    }
    "For expressions" - {
      "are similar to the for loop, but a yield keyword is added before " in {
        val r = for {
          n <- nums
        } yield n + 1
        r shouldBe Vector(2, 3, 4)
      }
      "can have multiple generators" in {
        val r = for {
          n <- nums
          m <- 1 to n
        } yield n * m
        r shouldBe Vector(1, 2, 4, 3, 6, 9)
      }
      "can have filters" in {
        val r = for {
          n <- nums if n % 2 == 1
          m <- 1 to n
        } yield n * m
        r shouldBe Vector(1, 3, 6, 9)
      }
      "can have definitions" in {
        case class Point(x: Int, y: Int)
        val points = Seq(Point(1, 1), Point(2, 2), Point(3, 0))
        val r = for {
          p <- points
          z = p.x + 1
          if z % 2 == 0
        } yield Point(z, p.y)
        r shouldBe Seq(Point(2, 1), Point(4, 0))
      }
      "are translated to calls to map, flatmap, and filter" in {
        val r = for {
          n <- nums if n % 2 == 1
          m <- 1 to n
        } yield n * m
        r shouldBe Vector(1, 3, 6, 9)

        val s = nums.filter(n => n % 2 == 1).flatMap(n =>
          (1 to n).map(m => n * m))
        s shouldBe Vector(1, 3, 6, 9)
      }
    }
  }
}
