package com.besant.packages.typecasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.breathe();
		
		
		
		//up casting 
		Animal Dogs = new Dog(); 
		// "Dogs" is a reference of type Animal, but it points to a Dog object.
		// You can only call the methods that are in the Animal class using the "Dogs" reference.
		// If Dog has its own version of a method from Animal, that version will run.
		// But you cannot call methods that exist only in the Dog class using the "Dogs" reference.

		Dogs.breathe();
//		Dog.walk();
		
		
		//down casting 
		Dog puppy = (Dog) animal;
		puppy.walk();
		puppy.breathe();
	}

}
