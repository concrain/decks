List myCollection = [1, -2, 3, -4, 5, -6, 7, -8, 9]
List positives = []
for(i in myCollection) {
    if(i > 0) {
        positives.add(i)
    }
}
println positives