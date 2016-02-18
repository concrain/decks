package org.ftts

import org.scalatest.{Matchers, FreeSpec}

/**
 * Created by russel on 3/20/15.
 */
class OptionSpec extends FreeSpec with Matchers {
  "Scala Option" - {
    case class Person(name: String, age: Option[Int])
    val bob = Person("bob", Some(30))
    val jack = Person("jack", None)
    val people = Set(bob, jack)
    "represents a value that does not have to be provided (optional)" in {
      bob.age shouldBe Some(30)
      bob.age.get shouldBe 30 // throws exception if 'None'
      bob.age.isDefined shouldBe true
      bob.age.getOrElse(0) shouldBe 30

      jack.age shouldBe None
      a [NoSuchElementException] shouldBe thrownBy {
        jack.age.get
      }
      jack.age.isDefined shouldBe false
      jack.age.getOrElse(0) shouldBe 0
    }
    "can be used to handle null" in {
      Option(null) shouldBe None
      val a = Option("hi")
      a shouldBe Some("hi")
      a.get shouldBe "hi"
    }
    "has many HOFs sen in collections" in {
      bob.age should contain(30)
      bob.age.contains(30) shouldBe true
      bob.age.filter(a => a <= 25) shouldBe None
      bob.age.map(a => a > 25) shouldBe Some(true)
    }
    "can be used in a for expression" in {
      val r = for {
        person <- people
        age <- person.age
      } yield age
      r shouldBe Set(30)
    }
    "can be pattern matched" in {
      val r = people.map {
        case Person(name, Some(age)) => s"$name: $age"
        case Person(name, None) => s"$name"
      }
      r shouldBe Set("bob: 30", "jack")
    }
  }

}
