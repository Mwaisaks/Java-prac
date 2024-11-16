Advanced Sorting
 * sorts lists that have objects in it
 * To sort objects you need to specify a rule that decides how objects are sorted
 * The Comparable and Comparator interfaces allow you to specify the rule used to sort objects
 * 
 Comparator
 * this interface has a single method: compare(T Object1, T Object2) 
 * It defines a way to compare two objects of type T and determine their order
 * compare() should return:
 * A negative integer if Object1 < Object2
 * A positive integer if Object1 > Object2
 * Zero if they are equal

 To generate constructors or tostring()- right click > source action >

 Comparable Interface
 -Allows an object to specify it's own sorting rule with a compareTo() method ~ works the same as compare() method
 Many native Java classes eg. String, Integer implement the Comparable interface, which is why strings and numbers do not need a comparator to be sorted

 Comparator Vs Comparable
 A comparator is an object with one method that is used to compare two different objects.

 A comparable is an object which can compare itself with other objects.

 It is easier to use the Comparable interface when possible, but the Comparator interface is more powerful because it allows you to sort any kind of object even if you cannot change its code.

 A common sorting trick;
 instead of 
 if (a.year< b.year) return -1;
 if (a.year > b.year) return 1;
 return 0;

 use
 return a.year - b.year;

 or sort in reverse
 return b.year - a.year;