def map = [
    // Implement FileFilter.accept(File) method.
    accept: { file -> file.path ==~ /.*\.(css|png)$/ }
] as FileFilter

new File('/Users/russeld').listFiles(map).each {
    println it
}