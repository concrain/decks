List myList = ['banana','apple','fish','elephant','dog','cook']

List alphabetical = myList.sort()
println alphabetical

List bySize = myList.sort() { it.size() }
println bySize