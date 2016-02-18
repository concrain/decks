//  as opposed to imperative style
//  mutate the variable

def totalFunctional(ages) {
  ages.inject(0) { partialSum, age ->
    partialSum + age
  }
}

ages = [1, 2, 3, 4, 5, 6, 7, 8]

println totalFunctional(ages)