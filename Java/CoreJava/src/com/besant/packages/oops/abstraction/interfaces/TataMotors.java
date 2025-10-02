package com.besant.packages.oops.abstraction.interfaces;

public class TataMotors implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("This car can accelerate.");
		
	}

	@Override
	public void engineCapacity() {
		System.out.println("This car has 500hp.");
		
	}

}
