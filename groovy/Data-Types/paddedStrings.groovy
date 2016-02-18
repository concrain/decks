                            
/**
 *  .inject() Applies an operation on a collection and keeps track of an intermediate value 
 *  .curry()  Assigning value to the parameters of a closure
 */
 
def createOutput = {
    def table = [
        // Page, Response time, Size
        ['page1.html',200, 1201],
        ['page2.html', 42, 8853],
        ['page3.html', 98, 3432],
        ['page4.html',432, 9081]
    ]

    def total = { data, index ->
        data.inject("injected__") { result, row ->     // .inject() = append to front of result
            result += row[index]
        } 
    }
    def totalTime = total.curry(table, 1)
    def totalSize = total.curry(table, 2)
    
    def out = new StringBuffer()
    out << ' Summary '.center(15, "*") << '\n\n'
    
    out << 'Total pages:'.padRight(36)
    out << table.size().toString().padLeft(6) << '\n'
    
    out << 'Total response time (ms):'.padRight(31)
    out << totalTime().toString().padLeft(6) << '\n'
    
    out << 'Total size (KB):'.padRight(25)
    out << totalSize().toString().padLeft(6) << '\n\n'
    
    out << ' Details '.center(25, "*") << '\n\n'
   
    table.each {
        out << it[0].padRight(14)
        out << it[1].toString().padLeft(5)
        out << it[2].toString().padLeft(8)
        out << '\n'
    }
    out.toString()
}
createOutput()
