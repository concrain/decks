/*
  For practice purposes: My version of the Java Counter Class

  Base Type vs. Class Type variable
  Static method vs. Static variable
  Abstract method & Abstract class & Inheritance 
  // TODO: Encapsulation
  // TODO: Polymorphism
  The Final modifier Class vs. Method vs. Field
  This Keyword [ Only available inside an non static method ]
*/

public class Counter {
	private static int count 	// static variable
	public Counter() { 
		this(0)					// this happens implicitely 
		counter() 				// constructor method calling a private static method of the same class
	}						
	public Counter(int count) { this.count = count }	// this keyword
	
	public int setCount(count) { return count }
	public int getCount() { return count }

	public int increment() { return ++count }
	public int increment(int delta) { return count +=delta }
	public int decrement() { return --count }
	public int decrement(int delta) { return count -=delta }
	public int reset() { return count =0 }

	/* static methods */
	private static int co =0						
	private static void counter() { co++ }			// -> db: save count	
	public static int getCounter() { return co }	// <- db: return count static method call

}

/* abstract class */
public abstract class Draw {	// abstract class can not be instantiated
	abstract def draw()			// abstract method
	Draw() { }					// constructor method 	
	private int d =0 

}

/* inheritance */
public final class Drawing extends Draw {	// final class can not be extended 
	public String draw() {				// invoking abstract method from super class
		println '       -'
		println '     -   -'
		println '   -       -'
		println ' -           -'
	}
	private final String drawUp() {		// final method can not be overridden by a subclass
		println '   -       -'
		println '     -   -'
		println '       -'
	}
	public static final String CHARACTER = " ||||||| |||||||"	// [ double quotes ] constant final base type cannot be overridden ever
	public char base = 'a'										// [ single quotes ]
	private double[] measurments = new double[10]				// array created with the new operator with typecheck
	private List measure = new double[10]						// cast double[10] to list
	private List m = [10]										// list m with one intValue() = 10

}

public class CounterDemo {
	CounterDemo() {}										// implicit constructor
	public static void main(String[] args) { println args }
	public enum Direction { EAST, WEST, NORTH, SOUTH }		// enumurator
	//Direction direction = Direction.valueOf("WEST")		// java set enum
	Direction direction = "WEST" as Direction 				// groovy set enum
	String east = Direction.EAST 							// groovy get enum

}

CounterDemo cd = new CounterDemo()
cd.main('1','2','3','4','5')
println cd.direction.dump()
println cd.east

Counter c 
c = new Counter()		// class type
println c.increment()
println c.increment(3)
int t = c.getCount()	// base type
println t
println c.reset()
Counter d = new Counter(5)
println d.decrement()
Counter e = d
println t = e.getCount()
println e.increment(2)

final Drawing drawing = new Drawing()	// final reference variable cannot be overridden
drawing.draw()
drawing.drawUp()
println drawing.base
println drawing.CHARACTER
println drawing.measurments
println drawing.measure
println drawing.m 

println Counter.getCounter()  // Static method calls do not call an instance


//

