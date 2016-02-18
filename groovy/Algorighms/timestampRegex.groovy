

//  Parse file and replace timestamp
def fileA = "/home/healthdock/vitality_tests/CERTIFY_SUMMIT_2013110747_78685863-47df-11e3-a4d4-cba3d90d4a7e.hl7"
String firstLineRebuilt = ""
String currentDate = new Date().toString()
def temp = currentDate.split(" ")
def currentYear = temp[temp.size()-1]
println currentYear

new File(fileA).readLines().each {
    def firstLineEach = it.split(/\|/)
    for(n in firstLineEach) {
        if (n.matches(currentYear+/\d+/)) {
            println "match " + n
            n = "timestamp"
        }
        firstLineRebuilt += n
        firstLineRebuilt += "|"
    }
    firstLineRebuilt += "\r"
}
//println firstLineRebuilt
println ""
firstLineRebuilt.readLines().each {
    println it
}