// Multiple Inheritance
// Multiple inheritance is not supported in Java
/*
Java does not support multiple inheritance (a class inheriting from more than one class) directly due to a few reasons:

Diamond Problem:

Ambiguity: 
When two classes have a method with the same name, 
and a third class inherits from both, 
it creates ambiguity as to which method the inheriting class should use. 
This is known as the "Diamond Problem".


Complexity: Handling multiple inheritance increases the complexity of the language 
and can lead to more errors and difficult-to-maintain code.


Simplicity and Readability:
Java designers aimed to keep the language simple and more readable. 
Allowing multiple inheritance would complicate the language syntax and semantics.


Design Philosophy:
Java follows a strict object-oriented approach, emphasizing 
single inheritance with interfaces to provide multiple inheritance-like 
functionality without the associated problems.

Can be overcome and can be implemented using the concept of Interfaces

*/
