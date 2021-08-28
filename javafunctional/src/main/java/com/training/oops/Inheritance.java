package com.training.oops;

public class Inheritance {

	public static void main(String[] args) {

		// create an object of the subclass
		Dog labrador = new Dog();

		// access field of superclass
		labrador.name = "Rohu";
		labrador.display();
		labrador.bark();

		// call method of superclass
		// using object of subclass
		labrador.eat();

		Cat cat = new Cat();
		cat.name = "Tom";
		cat.display();
		// Calls the method which has its own implementation.
		cat.eat();

		Tiger tiger = new Tiger();
		tiger.name = "Tiger";
		tiger.display();
		tiger.display("Leo");
		tiger.eat();

	}

}

class Animal {

	// field and method of the parent class
	String name;

	public void eat() {
		System.out.println("I can eat");
	}
}

// inherit from Animal
class Dog extends Animal {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}

	// new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}
}

// inherit from animal
class Cat extends Animal {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}

	@Override
	public void eat() {
		System.out.println("I can eat only cat food");
	}
}

//inherit from Animal
class Tiger extends Animal {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}

	@Override
	public void eat() {
		System.out.println("I can eat only meat");
	}

	// Over loading
	public void display(String name) {
		System.out.println("My name is changed to " + name);
	}

}
