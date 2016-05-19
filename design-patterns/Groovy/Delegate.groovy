// Delagate method
def closure = { println toUpperCase() }

closure.delegate = 'hello'
closure()
println("\n")

// Delegation Pattern 
// code reuse vs inheritance
class Worker {
    def work() { println "working..."}
}

class Expert {
    def work() { println "expert working..."}
    def analyze() { println "analyzing..."}
}

class Manager {
     @Delegate Worker worker = new Worker()
     @Delegate Expert expert = new Expert()   
}

def manager = new Manager()
manager.work()
manager.analyze()