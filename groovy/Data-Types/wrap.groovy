def input = "The quick brown fox jumps over the lazy dog. "
 
String.metaClass.wrap = {token, length ->
    def line = token
    def elements = delegate.tokenize().reverse()
 
    while(elements.size()){
        if ((line + elements.last()).size() < length){
            line += ' ' + elements.pop()
        }
        else {
            println line
            line = token
        }
    }
 
    if (line != token){
        println line
    }
}
 
(input * 10).wrap('>', 72)