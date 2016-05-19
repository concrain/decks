// Strategy Pattern
// functional level
def prices = [10, 20, 30, 40, 50]

def totalPrices(prices, selector) {
    def total = 0
    for(price in prices) {
        if(selector(price)) total += price
    } 
    total
}

println totalPrices(prices, {true})
println totalPrices(prices, {it < 35})
println totalPrices(prices) {it < 35}

// class level
class Equipment {
    def calculator
    
    Equipment(calc) {
        calculator = calc
    }
    
    def compute() {
        println "running calculation"
        calculator()
    }
}

def eq1 = new Equipment({ println "calculation-1" })
eq1.compute()

def anotherCalculator = { println "calc-2"}
def eq2 = new Equipment(anotherCalculator)
def eq3 = new Equipment(anotherCalculator)

eq2.compute()
eq3.compute()