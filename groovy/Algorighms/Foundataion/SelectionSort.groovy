/*
  Arrays vs. Linked-lists

  Array: 		Can't break the list apart.
  		      	You have to move your items around.

  		      	You already know where every item is located.  
  		      	You can get part of the list and read it.
  		      	[READING]

  Linked-list:  Item's can be anywhere in memory. ( Each item stores the address of the next item in the list )
                You never have to move your items around.

                Only the previous item knows where the next item is located.
                You must retrieve the whole list to read it.
				[INSERTION]
				[DELETION]

    DO-THIS ->
   	  1) Create a new list to store your new order
	  2) Iterate through the existing list to find the (lowest) rank
	  3) Return lowest rank and add to new list
	  4) Remove lowest rank from existing list
	  5) Repeat steps 2 - 4 until existing list is empty.
*/
/*
  Selection Sort:
  O(N**2)

*/

class SelectionSort {

	private int findSmallest(arr) {
		int smallest = arr[0]
		int smallestIndex = 0
        int index = 0

		for(i in arr) {
			if (i < smallest) {
				smallest = i
				smallestIndex = index
			}
		index++
		}
		arr.remove(smallestIndex)
		return smallest
	}

	private LinkedList selectionSort(arr) {
		LinkedList newList = []

		while(arr.size() > 0) {
			int smallest = findSmallest(arr)
			newList.add(smallest)
		}
		return newList
	}

}
ArrayList arr = [5,3,6,2,10,20]
SelectionSort ss = new SelectionSort()
println ss.selectionSort(arr)



// --------------
class Sort {

	private LinkedList sortedList = []
	private ArrayList unsortedList = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
	//ArrayList unsortedList = [1..20]

	private void sortList() {
		for (int i=0; i < unsortedList.size(); i++) {

			def b = 0
			def index = 0
			unsortedList.each { 
				// find highest rank
				index++
				def a = it
				if (a > b) {
					println("a= $a b= $b")
					b = a
				}
		    }
		    def idx = index - 1
		    putInList(idx, b)
		}
	}

	private void putInList(index, rank)  {
		println('  New item added to sortedList ' + rank)
		sortedList.add(rank)
		unsortedList.remove(index)
	}

	Sort() {
		sortList()
	}

}
/*
Sort s = new Sort()
s
println s.unsortedList
println s.sortedList
*/

