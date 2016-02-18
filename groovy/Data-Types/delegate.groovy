String.metaClass.call = { range ->
    delegate[range]  // convert to list
}
def value = 'Groovy is Gr8'

assert value.call(1) == value(1)
assert value(0..5) == 'Groovy'