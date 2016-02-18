package katas.diamond

import spock.lang.Specification
import spock.lang.Subject

class DiamondSpec extends Specification {

  @Subject def function = new Diamond()

  def 'diamonds are shiny'() {
  	given:
  	char[] pchar = ['p', 'a', 's', 's']
  	
  	def an1 = function.apply(pchar[0])

  	expect:
  	an1 == null

  }

}
