# Java-Study-Guide

Java notes

# Stack vs Heap

In java, there are two important areas of memory, the Stack and the Heap. 

The Stack contains:

1. ```Method invocations``` - when a method is called, the method lands on the top of a call stack. What is actually pushed onto the stack is the 'stack frame' which holds the state of the method (such as line of code and values of all local variables). A method stays on the stack until the method is completed (reaches its closing curly brace). For example, if method foo() calls method bar(), then bar() is stacked on top of foo().

2. ```Local variables``` - temporary variables that are declared inside a method. These variables will exist for as long as the method is on the stack. This also includes reference variables to objects. When an object is instantiated, the reference variable exists on the stack while the object exists on the heap.

The Heap contains:

1. ```Instance variables``` - a variable declared inside a class but not inside a method

2. ```Objects``` - 
