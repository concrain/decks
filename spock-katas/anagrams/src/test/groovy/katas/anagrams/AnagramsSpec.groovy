package katas.anagrams

import spock.lang.Specification
import spock.lang.Subject

class AnagramsSpec extends Specification {

  @Subject def function = new Anagrams()

  def 'anagrams are silly'() {
  	given:
  	def an1 = function.apply('silent')

  	expect:
  	an1 == null

  }

}
