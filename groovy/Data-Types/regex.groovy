// Regex remove all quotes
def input = '''\
"E0096581    96581002    1076446901    411116755    599717    E    TAYLOR    FREDOÑO    19610214    M    4874 BRONZE"
"                                                                                                                                                                                   "
"E0096581    96581003    1076442501    408274936    599717    E    FOWLKES    ALBERT    19650420    M    6623 CONIFER"
'''

def removeQuotes = /"(.*)"/
def regex = /(([^ ]+) ?+)/

input.split('\n').each {line ->
  println "Input: $line"

  def reg1 = (line =~ removeQuotes)[0][1]
  println "Exact: ${reg1}"
  
  def match = reg1 =~ regex
  println "Matches: $match, ${match.size()}"
  
  match.eachWithIndex {term, idx ->
    println "   Term[$idx]: ${term[2]}"
  }
}
null

/** 
 *
*/
def source = 'Read more about "Groovy" at http://mrhaki.blogspot.com/'

// 'Normal' slashy String, we need to escape / with \/
def regexp = /.*"(.*)".*\/(.*)\//
def matcher = source =~ regexp
assert matcher[0][1] == 'Groovy'
println '..'
println matcher[0][1]
assert matcher[0][2] == 'mrhaki.blogspot.com'

// Dollar slash String.
def regexpDollar = $/.*"(.*)".*/(.*)//$
def matcherDollar = source =~ regexpDollar
assert matcherDollar[0][1] == 'Groovy'
println '...'
println matcherDollar[0][1]
assert matcherDollar[0][2] == 'mrhaki.blogspot.com'

def multiline = $/
Also multilines
are supported.
/$