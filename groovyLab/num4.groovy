def feedUrl = 'http://www.certifydatasystems.com'
def data = new URL(feedUrl).text

//println('total size ' +data.size())
String html = data.toString()
println html.eachLine {
    if(it.endsWith('>')) {
        return
    }
    println it?.size()
}