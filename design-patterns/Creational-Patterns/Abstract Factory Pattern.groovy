/*
http://en.wikipedia.org/wiki/Abstract_factory_pattern

ABSTRACT FACTORY:
    Consists of a factory object producing object(s) of several classes,
    without specifying their concrete classes.

    DO-THIS ->
          1) Provide an interface for [ creating families of related or dependent objects ] 
          without specifying their concrete classes.

          2) A hierarchy that encapsulates: many possible 'Platforms' 
          and the construction of a suite of 'Products'

          3) A new operator is harmfull and must be encapsulated in one of the Products concrete class

        STRUCTURE ->
          1) Define a factory method per product
          2) Each factory method encapsulates the new operator, and the concrete platform-specific product class.
          3) Each platform is then modeled with a Factory derived class.
*/

/**
 * ProductA
 * Must have same structure as other products in factory
 * Family of concrete classes 
 */
class FlipCoinMessages {
    def welcome = 'Welcome to the twoup game, you start with $1000'
    def done = 'Sorry, you have no money left, goodbye'
}

class FlipCoinInputConverter {
    def convert(input) { input.toInteger() }
}

class FlipCoinControl {
    private money = 1000
    private random = new Random()
    private tossWasHead() {
        def next = random.nextInt()
        return next % 2 == 0
    }
    def moreTurns() {
        if (money > 0) {
            println "You have $money, how much would you like to bet?"
            return true
        }
        return false
    }
    def play(amount) {
        def coin1 = tossWasHead()
        def coin2 = tossWasHead()
        if (coin1 && coin2) {
            money += amount
            println 'You win'
        } else if (!coin1 && !coin2) {
            money -= amount
            println 'You lose'
        } else println 'Draw'
    }
}

/**
 * ProductB
 * Must have same structure as other products in factory
 * Family of concrete classes 
 */ 
class GuessGameMessages {
    def welcome = 'Welcome to the guessing game, my secret number is between 1 and 100'
    def done = 'Correct'
}

class GuessGameInputConverter {
    def convert(input) { input.toInteger() }
}

class GuessGameControl {
    private lower = 1
    private upper = 100
    private guess = new Random().nextInt(upper - lower) + lower
    def moreTurns() {
        def done = (lower == guess || upper == guess)
        if (!done) println "Enter a number between $lower and $upper"
        !done
    }
    def play(nextGuess) {
        if (nextGuess <= guess) lower = [lower, nextGuess].max()
        if (nextGuess >= guess) upper = [upper, nextGuess].min()
    }
}


 /**
  * @Interface
  * Construction of Product 
  */
def guessFactory = [messages:GuessGameMessages, control:GuessGameControl, converter:GuessGameInputConverter]
def coinflipFactory = [messages:FlipCoinMessages, control:FlipCoinControl, converter:FlipCoinInputConverter]

/**
 * @Interface
 * Factory
 * Create a hierarchy that encapsulates: many possible 'Platforms' and the construction of a suite of 'Products'
 */
class GameFactory {
    def static factory  // define the abstract object
    /**
     * Add mapped fields to abstract object
     * Create families of related or dependent objects without specifying their concrete classes. 
     */
    def static getMessages()  { return factory.messages.newInstance() }
    def static getControl()   { return factory.control.newInstance() }
    def static getConverter() { return factory.converter.newInstance() }
}
/**
 * Choose Product to run through Factory by selecting a Family of concrete classes
 *
 *  coinflipFactory
 *  guessFactory
 */
GameFactory.factory = guessFactory

/**
 * initialize product
 */
def messages  = GameFactory.messages  
def control   = GameFactory.control
def converter = GameFactory.converter

/**
 * run()
 *
 * All products must have the same class structure 
 * ex..  control.moreTurns()
 * ex..  control.play(input)
 * ex..  converter.convert(input)
 */
println messages.welcome            // <-
def reader = new BufferedReader(new InputStreamReader(System.in))
while (control.moreTurns()){        // <-
    def input = reader.readLine().trim()
    control.play(converter.convert(input))  // <-
}
println messages.done               // <-

//
