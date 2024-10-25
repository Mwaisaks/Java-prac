public class L_List {
    
}
/*
 * Similarities with ArrayList
 * common Interface
 * -both implement the list interface, meaning they share many of the same
 * methods, such as add(), get(), remove(), size().
 * both can store objects of the same type, allowing for a uniform 
 * collection of elements.
 * 
 * Differences
 * Differences:
Underlying Data Structure:

ArrayList: Utilizes a dynamic array to store elements. When you add an element and the array is full, a new larger array is created, and all elements are copied over, making this operation time-consuming (O(n)).
LinkedList: Utilizes a doubly linked list where each element is stored in a container (node). Each container has links to the previous and next containers. This allows for efficient insertion and deletion since only the links between containers need to be adjusted (O(1) for operations at the head or tail).
Insertion and Deletion:

ArrayList: When inserting or deleting an element (especially in the middle or beginning), elements must be shifted, making these operations costly (O(n)).
LinkedList: Insertion and deletion are faster because you only need to adjust the links between the nodes. There’s no need to shift elements, making these operations efficient (O(1) for the start or end of the list, O(n) for elements in the middle due to traversal).
Access Time:

ArrayList: Provides fast random access to elements (O(1)) since elements are stored in a contiguous block of memory and can be accessed via index.
LinkedList: Accessing an element is slower (O(n)) as you must traverse the list from the start or end until you reach the desired index.
Memory Usage:

ArrayList: Requires less memory overhead because it only stores the data itself.
LinkedList: Requires more memory because each element (container) stores both the data and two pointers (references) to the next and previous containers in the list.
When to Use Each:
Use ArrayList when you need:

Fast random access to elements (e.g., accessing data by index).
Primarily reading or searching through data, with fewer insertions or deletions in the middle of the list.
Use LinkedList when you need:

Efficient insertion and deletion of elements, particularly at the start or end of the list.
Manipulating data frequently, such as when performing many additions or deletions.

 */
