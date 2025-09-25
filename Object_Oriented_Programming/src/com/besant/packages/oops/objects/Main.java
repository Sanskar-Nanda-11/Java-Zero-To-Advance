package com.besant.packages.oops.objects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car marutisuzuki = new Car();
		marutisuzuki.carModel = " Alto k10 ";
		marutisuzuki.fuelType = " Petrol ";
		marutisuzuki.fuelCapacity =  10 ;
		marutisuzuki.power =  65.71f ;
		marutisuzuki.sunRoof = true;
		
		System.out.print(marutisuzuki.carModel + " of Maruti is a affordable model for some " );

		marutisuzuki.middleclasse();
		
//		System.out.print(" and cannot used for ");
//		marutisuzuki.Stunt();
		
		Car nano = new Car();
		nano.carModel = " Ford Maverick ";
		nano.fuelType = " Disele ";
		nano.fuelCapacity =  20 ;
		nano.power =  50.71f ;
		nano.sunRoof = false;
		
		System.out.print(nano.carModel + " of Ford is a model that can be used for ");
		nano.offroad();
	}

}
