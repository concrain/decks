assert '42'.isNumber()
assert '42'.isInteger() && '42'.isLong() && '42'.isBigInteger()
assert '42.42'.isDouble() && /42.42/.isBigDecimal() && '42.42'.isFloat()

def str = 'a1cB \n.9'
// Convert to char[]
def characters = str.chars
assert characters[0].isLetter()  // 'a'
assert characters[1].isDigit()  // '1'
assert characters[2].isLowerCase()  // 'c'
assert characters[3].isUpperCase()  // 'B'
assert characters[4].isWhitespace()  // ' '
assert characters[5].isWhitespace()  // '\n'
assert !characters[6].isLetterOrDigit()  // '.'
assert characters[7].isLetterOrDigit()  // '9'

def s = 'Accessing Strings in Groovy is easy.'
assert 'A' == s[0]
assert 'A' == s.getAt(0)
assert 'Groovy' == s[21..26]  // We can use ranges.
assert 'easy.' == s[s.indexOf('ea')..-1]

// We can also use each method on a String.
s[21..26].each { println "$it-" } // Output: G-r-o-o-v-y-