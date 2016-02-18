public class JavaObject {
    public static void javaSays(final String s) {
        System.out.println("Java says: Hello " + s + "!");
    }
}
def names = ['groovy', 'grails']

names.each { println 'Normal closure says: Hello ' + it + '!' }

def javaSaid = JavaObject.&javaSays
names.each javaSaid