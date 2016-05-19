/*
CHAIN OF RESPONSIBILITY:
    A way of passing a request between a chain of objects.
    
    In the Chain of Responsibility Pattern, objects using and implementing an interface (one or more methods) are intentionally loosely coupled. 
    It will decide whether to perform any action itself and whether to pass the request further down the line in the list.

    DO THIS ->
      1) Define an object that used all Classes
      2) Call the object.method()
*/

class UnixLister {
    private nextInLine
    UnixLister(next) { nextInLine = next }
    def listFiles(dir) {
        if (System.getProperty('os.name') == 'Linux')
            println "ls $dir".execute().text
        else
            nextInLine.listFiles(dir)        
    }
}

class WindowsLister {
    private nextInLine
    WindowsLister(next) { nextInLine = next }
    def listFiles(dir) {
        if (System.getProperty('os.name') == 'Windows XP')
            println "cmd.exe /c dir $dir".execute().text
        else
            nextInLine.listFiles(dir)        
    }
}

class DefaultLister {
    def listFiles(dir) {
        new File(dir).eachFile{ f -> println f }
    }
}

/**
 * It will decide whether to perform any action itself and whether to pass the request further down the line in the list.
 * Must have the same method call in each Class
 */
def lister = new UnixLister(new WindowsLister(new DefaultLister() ))
lister.listFiles('../Testing/list/')