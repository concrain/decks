class Simple {
    def hello(value) {
        "Hello $value, how are you?"
    }
    def goodbye() {
        println "Have a nice trip."
    } 
}

def s = new Simple()
def methods = ['hello', 'goodbye']

assert 'Hello russel, how are you?', s."$methods[0]"('russel')
assert 'Have a nice trip.', s."$methods[1]"

s.goodbye()
s."${methods[1]}"()