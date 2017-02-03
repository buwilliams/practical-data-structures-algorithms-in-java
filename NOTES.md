= Overview

- Two resources (memory areas): stack, heap
- Primitive data types, class/object variable, reference variables
- Stack:
	- main() -> creates a frame
	- method invocations create new frames
	- each variable gets assigned to the frame
	- as methods complete they "pop()" off the stack
- Heap:
	- Car myCar; myCar = new Car(); (not a primitive data type, it's a complex data type)
	- myCar is not a regular variable, it's a reference variable (refers to the memory address on the heap)
	- assigning myCar to a new reference, ie. myCar = new Car();
- Garbage Collection
	- process that runs in the heap
	- looks for objects that doesn't have any reference to them and removes them
	- frees of memory to be reused
- Instance Variable
	- many instances to the same class
	- stored in the heap

= Session 2, Lecture 8 - Big O Notation

- constant time
- linear time, single loop, O(n)
- quadratic, meaning squared, loop inside of a loop, O(n^2)
- cubic, 2 nested loops, O(n^3)
- exponential, O(n^n)
- Growth Rate (of algorithm: linear, quadratic), aka Algorithm Complexity
- Asymptotic Notation (constant = O(1), linear = O(n), quadratic = O(n^2)
- there are many problems that don't have a good algorithms
- Analysis of Algorithms, number of the steps or iterations

= Stack

- LIFO: Last in, first out
- push() to top
- pop() from top
- Algorithm: reverse the the letters in a word

= Queue

- FIFO: first in, first out

= LinkedList

- grow as large as needed
- insert data at any point
- uses pointers instead of an array
- only needs a reference to starting node, uses while loops to traverse

= SinglyLinkedList

- not efficient for finding the last node
- only has a reference to the first node

= CircularLinkedList

- efficient for finding the last node
- has a reference to the last node and the first node
- queues and stacks can be implemented on the CircularLinkedList (instead of an array)

= DoublyLinkedList

- node has a reference to the next and the previous nodes
