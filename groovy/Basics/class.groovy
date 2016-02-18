
class A {
	A() {
		println('A')
	}
	int randomNum() {
		int num = 10 
	}	
}

class B extends A {
	B() {
		println(randomNum())
		println super
	}

	def typeOf(Object type) {
		Object obj = new Object()
		obj = type
	}
}

class C extends B {
	C() {
		println(randomNum() + 10)
		B b = new B()
		println('abstract type ' + typeOf( b ))
		println '-'
	}
}

def all = new C()
all