def factorialImperative(number) {
  def fact = 1
  for(e in 1..number) { fact *= e }
  fact
}

def factorialImmutable(number) {
  (1..number).inject(1) { fact, e -> fact * e }
}

println factorialImperative(5)
println factorialImmutable(5)
