def totalSelectedValues(list, selector) {
  def total = 0
  for(e in list) { if(selector(e)) total += e }
  total
}


def list = [1, 4, 7, 2, 8, 8]

println totalSelectedValues(list, {true})
println totalSelectedValues(list, { e -> e % 2 == 0 })
println totalSelectedValues(list, { e -> e % 2 != 0 })
println totalSelectedValues(list, { it % 2 != 0 })


println totalSelectedValues(list) { it % 2 != 0 }