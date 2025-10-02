package com.besant.packages.typeCasting;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe();
		
		//up casting
		Animal dog = new Dog();
		dog.breathe();
//		dog.walk();
		
		//down casting
		Dog puppy = (Dog)dog;
		puppy.walk();
		puppy.breathe();

	}

}
