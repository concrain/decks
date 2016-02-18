/*
	Quicksort:
	  Faster than Selection Sort
	  Divide and Conquer = With every reursive call you have to reduce your problem.

	  Each level = O(n)
	  Height of the Call Stack = O(lg n)
	  Total Algorithm time = O(n lg n)!

	  PIVOT: 			Pick an element on the array, choose the middle index for best performance.
	  PARTITIONING:     Find elements bigger and smaller than your 'pivot', a sub-list of bigger and a sub-list of smaller elements.
	  BASE CASE: 		The simplest array you can get. (Decrease the size of your problem)
	  RECURSIVE CASE:   Patially complete function call STACK.
	  INDUCTIVE CASE:   The next step in your algorithm, must be recursive.
	  INDUCTIVE PROOF:  A way to prove your algorithm works.  2 steps, BASE CASE and INDUCTIVE CASE.

	  DO-THIS ->
	    Figure out the BASE CASE.
	    Divide your problem until it becomes BASE CASE.
	      Find your PIVOT.  Always the mid index of a list.
	      Sort elements left and right of your PIVOT into sub-arrays.  "PARTITIONING"
	      RECURSIVE CASE; function recursively calls itself until the BASE CASE.
*/

class QuickSort {

	private static ArrayList ar = [35,5,10,20,45,15,8,78,6,11]

	private static List quicksort(List list){
	    if (list.size() < 2) { // Base Case
	    	return list
    	} else {
		    int pivot = list[list.size.intdiv(2)] // Pivot
		    
		    /* Partition Left <> Right */
		    List left = list.findAll { it < pivot }
		    List right = list.findAll { it > pivot }
		    
		    println("${left} <- ${pivot} -> ${right}")
		    quicksort(left) + pivot + quicksort(right)  // <- Recursive Case 
		    /* Recursion will save STATE on partially complete function calls */
    	}
	}

	 QuickSort() {
	 	println ''
	 	println '  QuickSort'
	 	println ar
	 	println ''
	 	println quicksort(ar)
	 }

}
QuickSort qs = new QuickSort()


/**/
