String name = 'russel'
print name.toUpperCase()[0]
println name[1..name.length()-1]
println ''

def user = new Expando(name: 'russel', email: 'gmail.com')

// We can use closures in GStrings to do lazy evaluation.
// The closure is evaluated when the toString() method on the
// GString is invoked instead of when the GString is created.
// Closures can have zero or one arguments. With one argument
// we get a writer object we can write to, with zero arguments
// the toString() is called on the closure.

def directEval = "Current name value is ${user.name} and email is ${user.email}."
def lazyEval =   "Current name value is ${ -> user.name } and email is ${ out -> out << user.email }."
user.name = 'bill'
user.email = 'yahoo.com'

println directEval
// Output: Current name value is mrhaki and email is mail@email.com.

println lazyEval
// Output: Current name value is changed username and email is changed email.