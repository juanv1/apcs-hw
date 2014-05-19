HashMap vs HashSet:
- HashMap is an implementation of Map interface // HashSet is an implementation of Set interface
- HashMap stores a key and value pair // HashSet stores only objects
- HashMap uses put method to add element in map // HashSet uses add method to add element in set
- HashMap has a hashcode value calculated using the key object // HashSet uses the object to calculate a hashcode value
- HashMap allows null values and null keys
- HashMap does not allow duplicate keys, but does allow duplicate values // HashSet does not allow duplicate values

TreeMap vs TreeSet:
- TreeMap is an implementation of Map interface // TreeSet is an implementation of Set interfact
- TreeMap stores a key and value pair // TreeSet stores only objects
- TreeMap is sorted according to keys // TreeSet is sorted according to object
- TreeMap implements NavigableMap // TreeSet implements NavigableSet
- TreeMap allows duplicate values // TreeSet does not allow duplicate values

HashMap Implementation:
HashMaps have a default initial size of 16 and a load factor of .75. This means if the number of objects reaches 12 (16 * .75 = 12), then the capacity of the HashMap doubles and the objects rehash. This prevents too many collisions from occurring. 

TreeMap Implementation:
TreeMaps order the objects in ascending key order using Comparable. When you insert and delete objects, the TreeMap shifts and rebalances to maintain its properties.

HashMap is faster than TreeMap when adding objects:
Sample run for a million items:
HashMap: 529 milliseconds
TreeMap: 890 milliseconds

The built-in heap in Java is called PriorityQueue.