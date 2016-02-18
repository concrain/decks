def words = ['ant', 'buffalo', 'cat', 'dinosaur']
assert words.findAll{ w -> w.size() > 4 } == ['buffalo', 'dinosaur']

