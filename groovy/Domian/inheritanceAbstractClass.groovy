abstract class Person {
    String name 
}
class Parent extends Person {}
class Child extends Person {}

// Now we define methods to return the name with some extra info.
def printName(Person person) { "printName(Person): $person.name" }
def printName(Child child) { "printName(Child): $child.name" }
def printName(p) { "printName(p): $p.name" }

// Create new Parent and Child objects but use Person type reference.
Person parent1 = new Parent(name: 'Peter')
Person child1 = new Child(name: 'Russel')

assert 'printName(Person): Peter' == printName(parent1)
println(parent1.name)
println(child1.name)