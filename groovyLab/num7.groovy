def myList = (0..15)
//println myList

for(i in myList) {
    i = i.toBinaryString(i)
    while(i.length() < 4) {
        String temp = '0' + i
        i = temp
    }
    println i
}
println ''
println ''

(0..15).each { println Integer.toBinaryString(it).padLeft(4, '0') }