// Cascade Pattern

class Mailer {
    def to(addr) { println "to..." }
    def from(addr) { println "from..." }
    def sub(subject) { println "subject..." }
    def body(msg) { println "body..." }
    
    def static send(block) {
        Mailer mailer = new Mailer()
        // with = Delegate Pattern
        mailer.with block 
        println "sending..." 
    }
}

Mailer.send {
    to 'concrain@gmail.com'
    from 'bulder@agiledeveloper.com'
    sub 'Your code is awesome'
    body '.....'
}