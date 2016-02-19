/*
	Fibinachi
*/

class Fibinachi {

	private int fib(n) {
		// if n<2 return 1 else 
	    n<2 ? 1 : fib(n-1)+fib(n-2)
	}

	List<Integer> buildSequence(int stackNum) {
		int number = 0
		List fibValues = []

		while (number<stackNum) {
		    fibValues.add(fib(number))
		    //println fibValues
		    number++
		}
		return fibValues
	}

}
Fibinachi fib = new Fibinachi()
println fib.buildSequence(30)

