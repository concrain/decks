/*
	Merge Sort Algorithm
	Divide and Conquer

	Running Time = number of operations

	DO THIS ->
		Split the Array in half
		Sort each half recursivly
		Merge each half back together
*/

class MergeSort {
	
    static sort(int[] data) { sort(data, 0, data.length - 1) }

    /**
     * Sorts the range data[start..end] in O(nlgn) time and O(n) space.
     */
    static List sort(int[] data, int start, int end) {

        if (end > start) {

            int middle = (int) ((start + end) / 2)

            // Sort the left and right sides separately.
            println 'left sort ' + sort(data, start, middle)
            println 'right sort ' + sort(data, middle + 1, end)

            // Intertwine the data into one sorted list.
            mergeLists(data, start, middle, end)
            println ''
            println(" =-> ${data}   ${start} <<- ${middle} ->> ${end}")
            println ''
        }
        return data
    }

    /**
     * Merges the two sorted sublists of data[start..middle] and data[middle+1..end].
     * O(n) time and memory.
     */
    static mergeLists(int[] data, int start, int middle, int end) {

        // Copy the left and right arrays because we'll be overwriting them.
        int[] left = Arrays.copyOfRange(data, start, middle+1)
        println ' left merge ' + left
        int[] right = Arrays.copyOfRange(data, middle+1, end+1)
        println ' right merge ' + right

        // Now, merge the lists by repeatedly adding the biggest value, from whichever list has it.
        int i = start, l = 0, r = 0; // l and r are indexes in left and right
        while (l < left.length && r < right.length)
            println(' merge ' + ( data[i++] = (left[l] <= right[r]) ? left[l++] : right[r++] ))

        // Add any leftovers on one side.
        while (l < left.length)
            data[i++] = left[l++]
        while (r < right.length)
            data[i++] = right[r++]
    }

}

MergeSort ms = new MergeSort()
println ms.sort(5,4,1,8,7,2,6,3)

