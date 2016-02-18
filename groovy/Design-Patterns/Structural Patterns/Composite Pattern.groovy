/*
COMPOSITE:
    A tree structure of simple and composite objects.

    The intent of a composite is to "compose" objects into tree structures to represent 
    part-whole hierarchies. 
    Implementing the composite pattern lets clients treat single instances of an object the same way as a group of objects.

    The pattern is often used with hierarchies of objects. Typically, one or more methods should be callable in the same way for either leaf or composite nodes within the hierarchy. 
    Composite nodes typically invoke the same named method for each of their children nodes.
    If programmers find that they are using multiple objects in the same way, and 
    often have nearly identical code to handle each of them, then composite is a good choice.

    STRUCTURE ->
      Component = 1) The abstraction for all components, including composite ones.
                  2) Declares the interface for objects in the composition.
                  3) (optional) defines an interface for accessing a component's parent 
                    in the recursive structure, and implements it if that's appropriate
      
      Composite = 1) Represents a composite Component (component having children) 
                  2) Implements methods to manipulate children
                  3) Implements all Component methods, generally by delegating them to its children

           Leaf = 1) Represents leaf objects in the composition.
		          2) Implements all Component methods

    DO-THIS ->
	  1) Create an Abstract Component Class
	  2) Create an Composite Class that extends Component
	  3) 
	  4) Create a Leaf Class that endends Component
*/

/**
 * Component
 *
 *  1) The abstraction for all components, including composite ones.
 *  2) Declares the interface for objects in the composition.
 *  3) (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate
 */
abstract class Component {
	def name
	def toString(indent) {
		("-" * indent) + name
	}
}

/**
 * Composite
 *
 *  1) Represents a composite Component (component having children) 
 *  2) Implements methods to manipulate children
 *  3) Implements all Component methods, generally by delegating them to its children
 */	
class Composite extends Component {
	private children = []
	def toString(indent) {
		def s = super.toString(indent)
		children.each{ child ->
			s += "\n" + child.toString(indent+1)
		}
		return s
	}
	/**
	 * 
	 */
	def leftShift(component) {
		children << component
	}
}

/**
 * Leaf
 *
 *  1) Represents leaf objects in the composition.
 *  2) Implements all Component methods
 */
class Leaf extends Component {}


/**
 * Test
 */
def root = new Composite(name:"root")
root << new Leaf(name:"leaf A")
def comp = new Composite(name:"comp B")
root << comp
root << new Leaf(name:"leaf C")
comp << new Leaf(name:"leaf B1")
comp << new Leaf(name:"leaf B2")
println root.toString(0)

