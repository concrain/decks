/*
  Casting is an operation that allows us to change the type of a value. 
  In essence, we can take a value of one type and cast it into an equivalent value of another type. 
  There are two forms of casting in Java: explicit casting and implicit casting.

  (type) exp
  primitive to primitive && reference to reference
*/

/*
  Explicit Casting
  Casting from an int to a double is known as a WIDENING cast.
  But a cast from a double to an int is a NARROWING cast.  
*/

double d1 = 3.2
double d2 = 3.9999
int i1 = (int) d1		// i1 gets value 3
int i2 = (int) d2		// i2 gets value 3
double d3 = (double) i2	// d3 gets value 3.0

/*
  Using Wrappers
*/

String s1 = "2014"
int i1 = Integer.parseInt(s1) 		// i1 gets value 2014 
int i2 = −35
String s2 = Integer.toString(i2)	// s2 gets value ”-35”
  
/*
  Implicit Casting
  Only Implicitely Widen the cast
*/

int i1 = 42
double d1 = i1	 // d1 gets value 42.0
//i1 = d1			 / compile error: possible loss of precision

String s = Integer.toString(22)		// this is good
String u = "Value = " + 13 			// this is good

