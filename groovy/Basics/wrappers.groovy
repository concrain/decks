/*
	Base Types and Wrapper Classes
*/

Object b = new Boolean(true)
println b.booleanValue()

char z = 'Z'
Object c = new Character((char) z)
println c.charValue()

Object by = new Byte((byte) 34)
println by.byteValue()

Object s = new Short((short) 100)
println s.shortValue()

Object i = new Integer(1045)
println i.intValue()

Object l = new Long(10849L)
println l.longValue()

Object f = new Float(3.149F)
println f.floatValue()

Object d = new Double(3.149)
println d.doubleValue()

/*
 	Boxing and Unboxing
*/

class Boxing {
	public Integer box(int base) {
		Integer b = base
		return b
	}
	public int unbox(Integer base) {
		return base.intValue()
	}

}
Boxing boxing = new Boxing()
int three = 3
//println three.dump()
println boxing.box(three).dump()
println '-'
Integer four = new Integer(4)
//println four.dump()
println boxing.unbox(four).dump()















/* */
int j = 8
println j
Integer a = new Integer(12)
println a
int k = a 							// implicit call to a.intValue()
println k							
int m= j + a 						// a is automatically unboxed before the addition 
println m
a = 3 * m							// result is automatically boxed before assignment
println a
Integer b2 = new Integer("-135")	// constructor accepts a String
println b2
int n = Integer.parseInt("2013")	// using static method of Integer class
println n
