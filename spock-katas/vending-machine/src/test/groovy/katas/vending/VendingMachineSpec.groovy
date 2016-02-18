package katas.vending

import spock.lang.Specification
import spock.lang.Subject

class VendingMachineSpec extends Specification {

  Product coke

  def setup() {
  	Product coke = Mock()
  	Coin money = Mock()
  	money = 10
  	InsertCoins insertCoins = Mock()

  }

  def ''() {
  	given: ''
  	def hopper = Mock(VendingMachineHardware)
  	def machine = new VendingMachine(hopper)
  	machine.stock(coke, money)

  	when: ''
  	machine.purchase(coke)

  	then: ''
  	0 * hopper.dispense(coke)
  	thrown InsertCoins
  }

}
