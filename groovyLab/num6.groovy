String multiline = '''  Hello class mates, I hope 
                    you guys enjoy using groovy!'''
//println multiline
def count = 0
for(i in multiline) {
    if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
        count++
    }
}
println('Total count of vowels ' + count)

multiline.eachLine { line ->
    println line.toLowerCase().findAll(/[aeiou]/).size()
}