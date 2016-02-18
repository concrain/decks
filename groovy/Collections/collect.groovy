
def words = ['ant', 'buffalo', 'cat', 'dinosaur']
assert words.collect{ it[0] } == ['a', 'b', 'c', 'd']