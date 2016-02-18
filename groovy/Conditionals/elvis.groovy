//def sampleText
def sampleText = 'How you doin'

// Normal ternary operator.
def ternaryOutput = (sampleText != null) ? sampleText : 'Hello Groovy!'
// Groovy elvis operator.
def elvisOutput = sampleText ?: 'Viva Las Vegas!'