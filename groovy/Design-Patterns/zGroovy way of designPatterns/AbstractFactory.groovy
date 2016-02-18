/*
 Abstract Factory Pattern
 Abstract out the creation of an object from its implementation
*/

class Book {
    String title
    int page
}

class CD {
    String title
    int volume
    int track
}

/*
  Builder
*/
def build(klass, properties) {
    
    def instance = klass.newInstance()
    properties.each { name, value ->
        instance."$name" = value
    }
    instance
}

println build(Book, [title: 'Dr Who', page: 99]).dump()
println build(CD, [title: 'Dr Feelgood', volume: 10, track: 4]).dump()