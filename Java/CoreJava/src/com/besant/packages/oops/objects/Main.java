package com.besant.packages.oops.objects;

public class Main {

	public static void main(String[] args) {
		Car supra = new Car();
		supra.brand = "Toyota";
		supra.color = "Blue";
		supra.fuelCapacity = 50;
		supra.power = 385.5f;
		supra.convertible = false;
		System.out.print(supra.brand + " Supra car can be used for ");
		supra.racing();
		System.out.print(" and ");
		supra.stunts();
		
		Car beetle = new Car();
		beetle.brand = "Volkswagan";
		beetle.color = "Yellow";
		beetle.fuelCapacity = 40;
		beetle.power = 220.5f;
		beetle.convertible = true;
		System.out.println();
		System.out.print(beetle.brand + " Beetle car can be used for ");
		beetle.driving();
		System.out.print(" and ");
		beetle.racing();
		
		Car hoonicorn = new Car();
		hoonicorn.brand = "Ford";
		hoonicorn.color = "black";
		hoonicorn.fuelCapacity = 45;
		hoonicorn.power = 1400;
		hoonicorn.convertible = false;
		System.out.println();
		System.out.print(hoonicorn.brand + " Hoonicorn car can be used for ");
		hoonicorn.drifting();
		System.out.print(" and ");
		hoonicorn.offRoading();
	}

}
