package com.training.oops;

public class Abstraction {
	public static void main(String[] args) {

		// create an object of Dog class
		FriendlyDog d1 = new FriendlyDog();
		d1.makeSound();
		d1.eat();

		Snake s = new Snake();
		s.makeSound();
		s.makeSound("iss");
		s.eat();
	}
}

abstract class Pet {
	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat.");
	}
}

class FriendlyDog extends Pet {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Snake extends Pet {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Piss Piss");
	}
	
	// provide implementation of abstract method
	public void makeSound(String sound) {
		System.out.println("Piss Piss" + sound);
	}

	@Override
	public void eat() {
		System.out.println("I can eat rats");
	}
}