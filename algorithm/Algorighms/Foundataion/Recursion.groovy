/*
	Recursion:
	  Where a function calls itself

	  BASE CASE			= function end
	  RECURSIVE CASE	= function calls itself

	DO-THIS ->
	  Create a function that iterates through something.
	  If a condition is met the function shoud call itself and iterate through something else. "BASE CASE"
	  The second step is repeated until a condition is met. "RECURSIVE CASE"
*/

class SimpleRecursion {
	private void simpleRecursiveFunction(i) {
		println i
		if (i == 0) {
			return
		} else {
			simpleRecursiveFunction(i-1) // <- recursion
		}
	}
	private void printTitle() {
		println ''
		println '  SimpleRecursion'
	}

	SimpleRecursion() { 
		printTitle()
		simpleRecursiveFunction(10)
	}

}
SimpleRecursion simpleR = new SimpleRecursion() 
simpleR

	/***     ***/

class ListRecursion {
	private String tree = '-'

	ListRecursion() {
		println '  ListRecursion'
	}

	private void findItem(token, list) {
		int t = token

		for (i in list) {
			if (i instanceof Integer) { println(tree + i) } // show structure
			
			if (i == t) {
				println("  You found your token ${i}")
				return
			}
			if (i instanceof LinkedList) {
				tree = tree + tree
				findItem(t, i) // <- recursion
			}
		}
	}

}
LinkedList a = [1,2,3]
LinkedList b = [4,5,6]
LinkedList c = [7,8,9]
def token = 9

b.add(c)
a.add(b)
println ''
println '  List heirarchy ' + a	

ListRecursion listR = new ListRecursion()
listR.findItem(token, a)

	/***     ***/

class StackRecursion {
	/**
	 * Fractorial function 
	 * factorial(10) = 10!
	 * return 10*9*8*7*6*5*4*3*2*1
	 */
	def factorial(startNum) {
		if (startNum == 1) {
			return 1
		} else {
			def total = startNum * factorial(startNum-1) // <- recursion
			println total // show structure
			return total
		}
	}

	StackRecursion() {
		println ''
		println '  StackRecursion'
	}

}
StackRecursion stackR = new StackRecursion()
stackR.factorial(10)

	/***     ***/

	// TODO: Tail Recursion