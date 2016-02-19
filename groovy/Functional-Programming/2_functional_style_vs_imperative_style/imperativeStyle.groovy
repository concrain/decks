// Tell it what to do, every step of the way
// creating a new variable every step of the way

def totalImperative(ages) {
  def total = 0
  for(e in ages)
    total += e
  total
}

ages = [1, 2, 3, 4, 5, 6, 7, 8]

println totalImperative(ages)