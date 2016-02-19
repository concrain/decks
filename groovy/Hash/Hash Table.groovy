/**
 * Hash table study in groovy
 *
 * index = bucket
 * index = key/tableSize.remainder
 * ex..  453/100 = 4 remainder of 53 ( index = 53 )
 */

public class HashEntry {
	private int key
	private int value

 	HashEntry(int key, int value) { 
 		key = key
 		value = value
 	}
 	public int getKey() {
 		return key
 	}
 	public int getValue() {
 		return value
 	}

 }

public class HashMap extends HashEntry {
	private final static int TABLE_SIZE = 128

	def table

	HashMap() {
		table = new HashEntry[TABLE_SIZE]
		for(int i=0; i<TABLE_SIZE; i++) {
			table[i] = NULL
		}
	}
	
	public int get(int key) {
		int hash = (key % TABLE_SIZE)
		while (table[hash] !=NULL && table[hash].getKey() !=NULL) {
			hash = (hash +1) % TABLE_SIZE
		}
		if (table[hash] == NULL) {
			return -1
		} else {
			return table[hash].getValue()
		}
	}

	public int put(int key, int value) {
		int hash = (key % TABLE_SIZE)
		while (table[hash] !=null && table[hash].getKey() !=null) {
			hash = (hash + 1) % TABLE_SIZE
		}
		table[hash] = new HashEntry(key, value)
	}

}
HashMap hashMap = new HashMap()
hashMap
