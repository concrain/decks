package katas.fizzbuzz

import spock.lang.Specification
import spock.lang.Subject

class FizzBuzzSpec extends Specification {

  @Subject def function = new FizzBuzz()

  def 'fizzy buzz'() {
  	given:
    Integer num = 1

  	def an1 = function.apply(num)

  	expect:
  	an1 == null

  }

}
