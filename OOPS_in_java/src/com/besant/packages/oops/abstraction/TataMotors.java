package com.besant.packages.oops.abstraction;

public class TataMotors extends Vehicle{
	
	@Override // this is annotation , Override is used is used to say that the function in this class and the parent class
	void accelerate() {
		System.out.println(" acceleerated with tata engine ");
	}

	@Override
	void braking() {
		// TODO Auto-generated method stub
		System.out.println(" Nes ");
	}
}
