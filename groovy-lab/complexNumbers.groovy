@Grapes(
    @Grab(group='org.apache.commons', module='commons-math3', version='3.0')
)

import static org.apache.commons.math3.complex.Complex.*
import static java.lang.Math.*
import org.apache.commons.math3.complex.*

Complex lhs = new Complex(1.0, 3.0);
Complex rhs = new Complex(2.0, 5.0);

assert lhs.multiply(rhs) == lhs * rhs
println "multiply " + lhs * rhs
println "real, imaginary $lhs == ($lhs.real, $lhs.imaginary)"
println ''

ComplexFormat fmt = new ComplexFormat()
println "right hand side = " + fmt.format(lhs)
println "left hand side = " + fmt.format(rhs)
println ''

Complex.metaClass.plus = { Complex c -> delegate.add c }
Complex.metaClass.minus = { Complex c -> delegate.subtract c }
Complex.metaClass.div = { Complex c -> delegate.divide c }
Complex.metaClass.power = { Complex c -> delegate.pow c }
Complex.metaClass.negative = { delegate.negate() }
assert new Complex(3.0, 8.0) == lhs + rhs
assert new Complex(1.0, 2.0) == rhs - lhs
assert new Complex(0.5862068965517241, 0.03448275862068969) == lhs / rhs
assert new Complex(-0.007563724861696302, 0.01786136835085382) == lhs ** rhs
assert new Complex(-1.0, -3.0) == -lhs

Double.metaClass.power = { Complex c -> (new Complex(delegate,0)).pow(c) }

println fmt.format( ( I * PI ).exp() )
println fmt.format( new Complex(E, 0) ** (I * PI) )
println fmt.format( E ** (I * PI) )
assert (E ** (I * PI)).real == -1 
assert (E ** (I * PI)).imaginary < 1.0e-15 
Complex lhs2 = new Complex(1.0, 3.0);
Complex rhs2 = new Complex(2.0, 5.0);

assert lhs.multiply(rhs) == lhs * rhs
println lhs2 * rhs2
println "$lhs2 == ($lhs2.real, $lhs2.imaginary)"

ComplexFormat fmt2 = new ComplexFormat()
println fmt2.format(lhs)
println fmt2.format(rhs)

Complex.metaClass.plus = { Complex c -> delegate.add c }
Complex.metaClass.minus = { Complex c -> delegate.subtract c }
Complex.metaClass.div = { Complex c -> delegate.divide c }
Complex.metaClass.power = { Complex c -> delegate.pow c }
Complex.metaClass.negative = { delegate.negate() }
assert new Complex(3.0, 8.0) == lhs + rhs
assert new Complex(1.0, 2.0) == rhs - lhs
assert new Complex(0.5862068965517241, 0.03448275862068969) == lhs / rhs
assert new Complex(-0.007563724861696302, 0.01786136835085382) == lhs ** rhs
assert new Complex(-1.0, -3.0) == -lhs

Double.metaClass.power = { Complex c -> (new Complex(delegate,0)).pow(c) }

println fmt.format( ( I * PI ).exp() )
println fmt.format( new Complex(E, 0) ** (I * PI) )
println fmt.format( E ** (I * PI) )
assert (E ** (I * PI)).real == -1 
assert (E ** (I * PI)).imaginary < 1.0e-15 