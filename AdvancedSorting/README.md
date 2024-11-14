Advanced Sorting
 * sorts lists that have objects in it
 * To sort objects you need to specify a rule that decides how objects are sorted
 * The Comparable and Comparator interfaces allow you to specify the rule used to sort objects
 * 
 Comparator
 * this interface has a single method: compare(T Object1, T Object2) ~explain the syntax here
 * It defines a way to compare two objects of type T and determine their order
 * compare() should return:
 * A negative integer if Object1 < Object2
 * A positive integer if Object1 > Object2
 * Zero if they are equal

 To generate constructors or tostring()- right click > source action >