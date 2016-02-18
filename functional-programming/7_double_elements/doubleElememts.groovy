def doubleValues(list) {
  doubled = []
  for(e in list) { doubled << e * 2 }
  doubled
}

def doubleValues2(list) {
  list.collect { it * 2 }
}

def doubleEvenValues(list) {
  doubled = []
  for(e in list) { 
    if (e % 2 == 0)
      doubled << e * 2 
  }
  doubled
}

def doubleEvenValues2(list) {
  list.findAll { it % 2 == 0}.collect { it * 2 }
}

list = [1, 4, 7, 2, 8, 8]

println doubleValues(list)
println doubleValues2(list)

println doubleEvenValues(list)
println doubleEvenValues2(list)
