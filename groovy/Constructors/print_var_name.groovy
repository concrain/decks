def msg = '''
 Hello Mars!
'''

def msg1 = '''
 Hello world!
'''

def map = [msg: msg, msg1: msg1]

map.findAll { key, value -> 
    if (value.contains("Hello")) {
        println("var_name = ${key}")
    }
    else {
        println "Not there"
    }
}
println('')
map.findAll { key, value -> 
    if (key.contains("msg")) {
        println("value_of_var_name = ${value}")
    }
    else {
        println "Not there"
    }
}