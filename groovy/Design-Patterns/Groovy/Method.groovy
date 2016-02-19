// Method Injection

str = 'hello'
println str

str.metaClass.shout = { -> toUpperCase() }
println str.shout()
println str.class