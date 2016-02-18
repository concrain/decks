/*
	Stack:
	  A list with only two options
	    1) INSERT = When you add an item it get put on top of the list. "PUSH"
	    2) DELETE = You can only read the top-most item and then it gets deleted. "POP"

	    POP  = Read the top item.
	    PUSH = Add it's (items) to the stack.

	Call Stack:
	  A stack used to save variables for functions     
	    1) greet() Function call saves variable in memory.
		2) greet() Calls functions greet2() and bye().  These calls get put on top of the greet() call stack.

		Suspended State: When a function calls another function.  The calling function is suspended until the called function completes. 
*/

/**
 *		---------------------------------------------
 *		| MemoryLocation 3 = bye()    name:'Russel' |
 *		| MemoryLocation 2 = greet2() name:'Russel' |
 *		| MemoryLocation 1 = greet()  name:'Russel' |
 *		---------------------------------------------
 */
def greet(name) {
	println("Hello ${name}!")
	greet2(name) // add to call stack
	println("getting ready to say goodbye...")
	bye(name) // add to call stack
}
/**
 *		---------------------------------------------
 *		| MemoryLocation 2 = greet2() name:'Russel' |
 *		| MemoryLocation 1 = greet()  name:'Russel' |
 *		---------------------------------------------
 */
def greet2(name) {
	println("how are you ${name}?")
}
/**
 *		---------------------------------------------
 *		| MemoryLocation 1 = greet()  name:'Russel' |
 *		---------------------------------------------
 */
def bye(name) {
	println('ok bye! ' + name)
}
greet('Russel') // start call stack
