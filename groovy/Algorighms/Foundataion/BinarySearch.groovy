/*
  Binary Search:
  (This technique only works when your index is in order)

      Linear Time: O(n)
      Logarithmic Time: O(1g n)

	  DO-THIS ->
	    Cut each guess in half until you find the correct index

  numberOfSteps = log2 x n

	  ex.. n = 32
	    logarithms = numberOfSteps
	      n = size of list
	      log2 * n = 5
	    or
	      2**5 = 32  [2x2x2x2x2]
	      numberOfSteps = 5

	----
	 
	    big-O notation = how fast an algorithm grows
	      n**2 = 32
		or	
	      1g == log2
		  algorithmSpeed = O(1g * n)	

*/

class BinarySearch {

	int search(List list, int base) {
		int low = 0
		int high = list[0].size() 
		int steps = 0

		while (low <= high) {
			steps++
			int guess = Math.round((low + high) / 2)	  
			//println("O - ${guess}")

			if (guess == base) {
				println ''
				println '  BinarySearch'
				println("num of operations = ${steps}")
				println("index location    = ${guess}")
				return guess
			}
			if (guess >= base) {
				high = guess 
			} else {
				low = guess  
			}
		} 
	}

}
List myList = [1..128]

BinarySearch bs = new BinarySearch()
bs.search(myList, 126)