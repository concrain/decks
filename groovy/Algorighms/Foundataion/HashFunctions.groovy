/*
	Hash Functions:
	  Where you put in a string and get back a number.
	  A HASH FUNCTION maps strings to numbers.

	  The Hash Function consistently maps a name to an index.
	  The Hash Function maps different strings to different indexes.
	  The Hash Function knows how big your array is.

	  A Hash Function and an Array = a HASH TABLE aka 'HASH MAP, or MAP' (Much faster than a List)

	Hash Table:
	  key = 'apple'
	  value = 0.67 

	  LOAD FACTOR = num of items in the hash table / total num of slots

	  Use a Hash Table when you need to
	    1) Create a mapping from one thing to another. 
	    2) Look something up.
	    3) Filter out duplicates.  (Collisions)

*/

class HashFunction {

	private HashMap voted = [:]

	private void checkVoter(String name) {
		if (voted.get(name)) {
			println name + ' already voted, kick him out'
		} else {
			voted [name] = 'true'
			println name + ' just voted'
		}		
	}

	HashFunction() {
		println ''
		println '  HashFunction'
	}

}
HashFunction hf = new HashFunction()
hf.checkVoter('russel')
hf.checkVoter('mike')
hf.checkVoter('russel')

println hf.getClass()
println hf.voted
println hf.voted.russel
