/*
ADAPTOR:
    Allows objects satisfying one interface to be used where another type of interface 
    is expected. 

    Object Adaptor Pattern: The adapter contains an instance of the class it wraps.

    Class Adaptor Pattern: Uses multiple polymorphic interfaces to achieve its goal. 
    The adapter is created by implementing or inheriting both the interface that is expected and the interface that is pre-existing. 

    DO-THIS ->
      1) Convert the interface of one class into an interface expected by the clients. 
*/

/**
 *  Three classes that require different interfaces
 */
	class SquarePeg {
	    def width
	}
	class RoundPeg {
	    def radius
	}

	class RoundHole {
	    def radius
	    def pegFits(peg) {
	        peg.radius <= radius
	    }
	    String toString() { "RoundHole with radius $radius" }
	}

/**
 * Adaptor Pattern
 * Convert the interface of one class into an interface expected by the clients.
 */
class SquarePegAdapter extends SquarePeg{
    def getRadius() {
        Math.sqrt(((width/2) ** 2)*2)
    }
    String toString() {
        "SquarePegAdapter with peg width $width (and notional radius $radius)"
    }
}

/**
 * Test
 */
def hole = new RoundHole(radius:4.0)
	(4..7).each { w ->
    def peg = new SquarePegAdapter(width:w)
    if (hole.pegFits(peg))
        println "peg $peg fits in hole $hole"
    else
        println "peg $peg does not fit in hole $hole"
}


/*
Adapting using the ExpandoMetaClass
After you create a peg object, you can simply add a property to it on the fly. No need to change the original class and no need for an adapter class.

  def peg = new SquarePeg(width:w)
  peg.metaClass.radius = Math.sqrt(((peg.width/2) ** 2)*2)
*/

//