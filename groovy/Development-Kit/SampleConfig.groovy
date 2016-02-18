/*
	ConfigSlurper:
	A utility class for reading configuration files

*/

def config = new ConfigSlurper().parse('''
    
        app.date = new Date()  
        app.age  = 42
        app { name = "Test${42}" }
    ''')

println config.app.date
println config.app.age
println config.app.name

println config.properties
config.class.metaClass.home = 'California'

