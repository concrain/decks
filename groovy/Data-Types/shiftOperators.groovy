def a = 2 // starting number
def b = 2 // number of shifts in the 32-bit binary
def lshift = a << b
println lshift
//  (6 << 1)
//  00000000 00000000 00000000 00000110  = 6
//  00000000 00000000 00000000 00001100  = 12


def rshift = a >> b
println rshift

def power = a ** b
println power