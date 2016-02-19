// Iterator Pattern
def names = ["Joe","Jame","Jim","John","Janice"]

// good
// for (name in names) {
//     println name
// }
// better iterator
names.each { println it }
// even better
names.eachWithIndex { e, i -> println "$i $e"}

// find the first
println names.find { it.length() == 4 }
// find all in colection
println names.findAll { it.length() == 4 }
// format the collection in a list
println names.join(', ')