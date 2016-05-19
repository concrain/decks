// Intercept-Cache-Invoke Pattern

class Person {
    def activities
    def work() { println "working..."}
    
    def methodMissing(String name, args) {
        println "You called $name"
        if (name.startsWith('play')) {
            def activity = name.split('play')[1]
            if (activities.contains(activity))  {
               def impl = { Object[] theArgs ->  println "supported $activity" }
               this.getMetaClass()."$name" = impl
               return impl(args)
            }               
        }        
        throw new MissingMethodException(name, this.class, args)
    }
}

def sam = new Person()

sam.activities = ['Football', 'Tennis']

sam.work()
println sam.metaClass.methods.size()
sam.playTennis()
sam.playTennis()
sam.playTennis()
println sam.metaClass.methods.size()
