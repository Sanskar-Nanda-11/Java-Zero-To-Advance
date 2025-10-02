package com.besant.packages.accessModifiers;

public class Flights {

	//Public - can be accessed anywhere in the project
	public static String flightName;
	public int price;
	
	//private - can be accessed only in this class file
	private String engineMake;
	
	
	public String getEngineMake() {
		return engineMake;
	}
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}
	
	//protected - can be accessed within the same package
	protected String pilotName;
	
	//Default - can be accessed within the same package and the child classes
	void takeOff() {
		System.out.println("Flight is taking off the runway");
	}
	public static void main(String[] args) {
		Flights air = new Flights();
		air.engineMake = "fghjk";
	}
	
}
