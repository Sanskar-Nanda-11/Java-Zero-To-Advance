package com.besant.packages.oops.inheritence;

public class Car {
	byte numberOfWheels;
	String color;
	int weight;
	int gears;
	boolean automatic;
	boolean allWheelDrive;
	
	void driving() {
		System.out.println("Cars are used to drive");
	}
	void racing() {
		System.out.println("Cars are used for racing");
	}
	void stunt() {
		System.out.println("Cars are used to perform stunts");
	}
	void drifting() {
		System.out.println("Cars are used to drift");
	}
}
