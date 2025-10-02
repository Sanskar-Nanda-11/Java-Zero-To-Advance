package com.besant.packages.staticKeyword;

public class Main {

	public static void main(String[] args) {
		
		//Static method is class level and can be accessed by using the class name
		Car.accelerate();
		
		//braking is object level and can be accessed only if we create a an object
		Car car = new Car();
		car.braking();
		
		Train.engineStart();
		
	}

}
