# OOPS (Object Oriented Programming)


OOP's Consists of below Concepts:

* Inheritance
* Method Overloading and Overriding
* Polymorphism
* Encapsulation
* Abstract Classes
* Interfaces


## Inheritance

Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

The new class that is created is known as subclass (child or derived class) and the existing class from where the child class is derived is known as superclass (parent or base class).

The extends keyword is used to perform inheritance in Java

## Overriding
Every method in Super class can be overridden by its subclass for its own implementation with a annotation @Override


## polymorphism
Polymorphism is an important concept of object-oriented programming. It simply means more than one form.
That is, the same entity (method or operator or object) can perform different operations in different scenarios.

## Overloading
In Java, every method in a class should have one unique method signature and unique name, 
but methods with same name can be created with different method signature. which is call overloading.

## Encapsulation

Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.

It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.


Creating Private variables and giving access to setter and getter methods will allow for better encapsulation.


## Abstract Classes

Java Abstract Class

The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class.

```
// create an abstract class

abstract class Language {
  // fields and methods
}

// try to create an object Language
// throws an error
Language obj = new Language(); 

```

Implementing Abstract Methods

If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract.

Overloading and Overriding are also available for implementing the methods.



## Interfaces

An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java

Like abstract classes, we cannot create objects of interfaces.

To use an interface, other classes must implement it. We use the implements keyword to implement an interface.

Similar to classes, interfaces can extend other interfaces. The extends keyword is used for extending interfaces. 

Similar to abstract classes, interfaces help us to achieve abstraction in Java.


