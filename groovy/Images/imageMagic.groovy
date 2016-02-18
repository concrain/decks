/**
 * http://www.imagemagick.org/
*/

// list
def thumbnail = ["convert", "file.jpg", "-thumbnail", "100x100", "thumb-file.gif"].execute()

thumbnail.waitFor()
println "Exit value: ${thumbnail.exitValue()}"
println "Output: ${thumbnail.text}"


// string
new File('.').eachFileMatch(~/.*.jpg$/) {
    def converter = "convert ${it.name} -thumbnail 100x100 thumb -${it.name - '.jpg'}.gif".execute()
    converter.waitFor()
    
    if (converter.exitValue()) {
        println "Error creating thumbnail for ${it.name}:"
        println converter.text
    } else {
        println "Created a thumbnail for ${it.name}."
    } 
}