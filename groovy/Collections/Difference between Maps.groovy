/*
All three classes implement the Map interface and offer mostly the same functionality. 
The most important difference is THE ORDER IN WHICH ITERATION THROUGH ENTRIES WILL HAPPEN:

HashMap makes absolutely no guarantees about the iteration order. 
It can (and will) even change completely when new elements are added.

TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). 
Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.

LinkedHashMap will iterate in the order in which the entries were put into the map.


"Hashtable" is the generic name for hash-based maps. In the context of the Java API, 
Hashtable is an obsolete class from the days of Java 1.1 before the collections framework existed. 
It should not be used anymore, because its API is cluttered with obsolete methods that duplicate functionality, and its methods are synchronized (which can decrease performance and is generally useless). 

Use ConcurrrentHashMap instead of Hashtable.
*/

println('- HashMap')
Map m1 = new HashMap()
m1.put("map", "HashMap")
m1.put("schildt", "java2")
m1.put("mathew", "Hyden")
m1.put("schildt", "java2s")
//println(m1.keySet())
//println(m1.values())
println m1

println('- TreeMap')
SortedMap sm = new TreeMap()
sm.put("map", "TreeMap")
sm.put("schildt", "java2")
sm.put("mathew", "Hyden")
sm.put("schildt", "java2s")
println(sm.keySet()) 
println(sm.values())

println('- LinkedHashMap')
LinkedHashMap lm = new LinkedHashMap()
lm.put("map", "LinkedHashMap")
lm.put("schildt", "java2")
lm.put("mathew", "Hyden")
lm.put("schildt", "java2s")
//println(lm.keySet())
//println(lm.values())
println lm