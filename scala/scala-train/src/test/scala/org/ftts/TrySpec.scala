package org.ftts

import java.net.{URL, MalformedURLException}
import org.scalatest.{Matchers, FreeSpec}
import scala.util.{Success, Try, Failure}

/**
 * Created by russel on 3/20/15.
 */
class TrySpec extends FreeSpec with Matchers {

  "Scala supports try-catch blocks much like Java" - {
    "but the catch block is a pattern match (PartialFunction)" in {
      def mkurl(urlString: String) =
      try {
        new URL(urlString)
      } catch {
        case mue: MalformedURLException => s"no good: ${mue.getMessage}"
        case _: Exception => "something bad went wrong"
      }
      mkurl("fiz://typesafe.com") shouldBe s"no good: unknown protocol: fiz"
      mkurl("http://typesafe.com") shouldBe a [URL]
    }
  }
  "Scala Try" - {
    def mkurl(url: String): Try[URL] = Try(new URL(url))
    "wraps operations that could fail with an exception" in {
      val r = mkurl("fiz://typesafe.com")
      r shouldBe a[Failure[_]]
      r.isFailure shouldBe true
      a[MalformedURLException] shouldBe thrownBy {
        r.get
      }
      val s = mkurl("http://typesafe.com")
      s shouldBe a[Success[_]]
      s.isSuccess shouldBe true
      s.get shouldBe a[URL]
      s.get.toString shouldBe "http://typesafe.com"
    }
    "can bre used in pattern matching" in {
      def isurl(test: String) = mkurl(test) match {
        case Success(u) => true
        case Failure(t) => false
      }
      isurl("fiz://typesafe.com") shouldBe false
      isurl("http://typesafe.com") shouldBe true
    }
  }
}
