package com.besant.packages.accessModifiers;

public class Main {

	public static void main(String[] args) {
		Flights indigo = new Flights();
		//public
		Flights.flightName = "indigo";
		System.out.println(Flights.flightName);
		indigo.price = 2000;
		System.out.println(indigo.price);
		//private
		indigo.setEngineMake("Timken");
		System.out.println(indigo.getEngineMake());
		//protected
		indigo.pilotName = "Tom";
		System.out.println(indigo.pilotName);
		//default
		indigo.takeOff();
	}

}
