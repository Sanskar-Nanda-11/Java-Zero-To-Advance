package com.besant.packages.oops.inheritence;

public class Main {

	public static void main(String[] args) {
		
		//Parent class
		Car suv = new Car();
		suv.numberOfWheels = 4;
		suv.color = "White";
		suv.weight = 1750;
		suv.gears = 6;
		suv.automatic = false;
		suv.allWheelDrive = true;
		
		suv.driving();
		
		//Hierarchical inheritance start
		//Single inheritance start
		SuperCars gallardo = new SuperCars();
		gallardo.power = 510;
		gallardo.spoilers = true;
		gallardo.numberOfWheels = 4;
		gallardo.color = "Yellow";
		gallardo.weight = 1750;
		gallardo.gears = 7;
		gallardo.automatic = false;
		gallardo.allWheelDrive = false;
		
		gallardo.racing();
		gallardo.drifting();
		//Single inheritance end
		
		RallyCars lancia = new RallyCars();
		lancia.chassis = "Re-enforced";
		lancia.numberOfWheels = 4;
		lancia.color = "Yellow";
		lancia.weight = 1750;
		lancia.gears = 7;
		lancia.automatic = false;
		lancia.allWheelDrive = true;
		
		lancia.racing();
		//Hierarchical inheritance end
		
		//Multilevel inheritance
		Buggati veyron = new Buggati();
		veyron.topSpeed = 400;
		veyron.numberOfWheels = 4;
		veyron.color = "White";
		veyron.weight = 1750;
		veyron.gears = 6;
		veyron.automatic = false;
		veyron.power = 510;
		veyron.spoilers = true;
		veyron.allWheelDrive = false;
		
		veyron.racing();
		veyron.speedTest();
	}

}
