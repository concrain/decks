def max1(list) {
  def max = list[0]
  for (e in list) { if (max < e) max = e }
  max
}

def list = [1, 4, 7, 2, 8, 8]

println max1(list)

println list.inject(list[0]) { 
  max, e -> max < e ? e : max 
}

println list.max()