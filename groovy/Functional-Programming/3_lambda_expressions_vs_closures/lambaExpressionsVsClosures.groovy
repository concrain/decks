list = [1, 2, 3, 4, 5, 6, 7, 8]

list.each { e -> println e }
// e is bound to parameter - lambda expression

final def factor = 2 

list.each { e -> println e * factor }
// e is bound to parameter, but
// factor is bound to variable in the
// lexical scope - closure

