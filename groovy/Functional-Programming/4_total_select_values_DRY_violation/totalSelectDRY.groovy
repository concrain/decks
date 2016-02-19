def totalValues(list) {
  def total = 0
  for(e in list) { total += e }
  total
}

def totalEvenValues(list) {
  def total = 0
  for(e in list) { if(e % 2 ==0) total += e }
  total
}

def totalOddValues(list) {
  def total = 0
  for(e in list) { if(e % 2 !=0) total += e }
  total
}


def list = [1, 4, 7, 2, 8, 8]
println totalValues(list)
println totalEvenValues(list)
println totalOddValues(list)
