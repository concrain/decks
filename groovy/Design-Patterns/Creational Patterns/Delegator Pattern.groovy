/*
  DELEGATION:
    http://en.wikipedia.org/wiki/Delegation_pattern

    A technique where an object's behavior (public methods)
    are implemented, by delegating responsibility to one or more 'associated' objects.

    Where an object, instead of performing one of its stated tasks, delegates that task 
    to an associated helper object. 
    There is an Inversion of Responsibility in which a helper object, known as a 
    delegate, is given the responsibility to execute a task for the delegator.

     '' The delegation pattern is one of the fundamental abstraction patterns that underlie 
        other software patterns such as composition (also referred to as aggregation), 
        mixins and aspects. ''

    DO-THIS ->
      1) Create delegator task(s) in a seperate Class MortgageLender()
      2) Create helper object(s) in the Delegator() Class
      3) Instantiate the Delegator() Class using the Class to be delegated
      4) Use the Delegator to call the task(s) from the other Class MortgageLender()
*/

/**
 *  The ExpandoMetaClass gives the ability to overide an existing method
 */
class Delegator {
    private targetClass // delegated task
    private delegate    // helper object(s)

    Delegator(targetClass, delegate) {
        this.targetClass = targetClass
        this.delegate = delegate
    }

    /**
     * Helper object(s) 
     * are given the responsibility to execute a task for the delegator
     */
    def delegate(String methodName) {
        delegate(methodName, methodName)
    }
    /**    ExpandoMetaClass = overide an existing method and add getMoney() 'asMethodName'    */
    def delegate(String methodName, String asMethodName) {
        targetClass.metaClass."$asMethodName" = delegate.&"$methodName"
    }
    def delegateAll(String[] names) {
        names.each { delegate(it) }
    }
    def delegateAll(Map names) {
        names.each { k, v -> delegate(k, v) }
    }
    def delegateAll() {
        delegate.class.methods*.name.each {
          delegate(it) 
        }
    }
}

class Person {
    String name
}

/**
 *  Public methods will be used by the Delegator
 */
class MortgageLender {
    def borrowAmount(amount) {
       "borrow \$$amount"
    }
    def borrowFor(thing) {
       "buy $thing"
    }
}

/**
 *  Instantiate the Delegator() Class using the Class to be delegated
 */
def lender = new MortgageLender()
def delegator = new Delegator(Person, lender)

/**
 *  Delegate
 *  Object's behavior (public methods) are implemented, by delegating responsibility to one or more 'associated' objects.
 */
delegator.delegate('borrowFor')
delegator.delegate('borrowAmount', 'getMoney')

def p = new Person()

println p.borrowFor('present')   // => buy present
println p.getMoney(50)           // => borrow $50

// delegator.delegateAll('borrowFor', 'borrowAmount')
// delegator.delegateAll()

//