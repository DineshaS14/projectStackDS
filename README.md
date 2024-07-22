# Stack Data Structure in Java

This project provides an implementation of a generic Stack data structure in Java. The Stack class supports basic stack operations such as push, pop, peek, and more. The implementation includes a Node class for representing elements in the stack.

To Compile and Run: (On terminal environment)
Activate with the command:
> chmod +x run.sh
> ./run.sh

Generic stack implementation
Basic operations: push, pop, peek, isEmpty, clear, contains
Conversion to array
String representation of the stack

# Node
This class represents a node in the stack.

## Constructors
Node(T value): Initializes a new node with the specified value.
Node(T value, Node<T> nextValue): Initializes a new node with the specified value and next node.
## Methods
void setItem(T value): Sets the value of the node.
T getItem(): Returns the value of the node.
void setNext(Node<T> nextValue): Sets the next node.
Node<T> getNext(): Returns the next node.

# Stack
This class represents the implementation of the Stack data structure.

## Constructor
Stack(): Initializes a new empty stack.
## Methods
boolean isEmpty(): Checks if the stack is empty.
void push(T value): Adds a value to the stack.
T pop(): Removes and returns the top value of the stack.
T peek(): Returns the top value of the stack without removing it.
void clear(): Clears the stack.
boolean contains(T value): Checks if the stack contains a value.
T[] toArray(): Converts the stack to an array.
String toString(): Returns a string representation of the stack.

Stack Class
isEmpty():

Time Complexity: O(1)
Space Complexity: O(1)
push(T value):

Time Complexity: O(1)
Space Complexity: O(1)
pop():

Time Complexity: O(1)
Space Complexity: O(1)
peek():

Time Complexity: O(1)
Space Complexity: O(1)
clear():

Time Complexity: O(1)
Space Complexity: O(1)
contains(T value):

Time Complexity: O(n)
Space Complexity: O(1)
toArray():

Time Complexity: O(n)
Space Complexity: O(n)
toString():

Time Complexity: O(n)
Space Complexity: O(n)
Node Class
setItem(T value):

Time Complexity: O(1)
Space Complexity: O(1)
getItem():

Time Complexity: O(1)
Space Complexity: O(1)
setNext(Node<T> nextValue):

Time Complexity: O(1)
Space Complexity: O(1)
getNext():

Time Complexity: O(1)
Space Complexity: O(1)

By: Dinesha Shair (shair914@gmail.com)
    Feel free to reach out to me with any question or concern!
