List myList = [1,2,3,4,5,6,7]
def list1 = myList.sum()
println('Sum of first list '+list1)

List newList = []
myList.each { newList << (it*2) }
def list2 = newList.sum()
println('Sum of second list '+list2)

def list3 = myList.collect { it *  2 }.sum() // collect
assert list3 == 56

def average = (list1 + list2) / 2 
println('The averages of both lists are ' +average)

assert 56 == myList.inject(0) { acc, val -> acc + val * 2 } // inject  { accumulator, value }