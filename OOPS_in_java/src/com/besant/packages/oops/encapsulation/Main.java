package com.besant.packages.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Car me = new Car();
		me.setBrandname(" BMW ");
		me.setEnginecapacity(50);
		me.setCountofspeed(50);
		
		System.out.println(me.getBrandname());
		System.out.println(me.getEnginecapacity());
		System.out.println(me.getCountofspeed());
		
		
		Animal Cow = new Animal();
		Cow.setEyes(2);
		Cow.setHeight(20);
		Cow.setType("Domestic");
		Cow.setWeight(20);
		Cow.setlegs("Yes");
		
		System.out.println(Cow.getEyes());
		System.out.println(Cow.getHeight());
		System.out.println(Cow.getType());
		System.out.println(Cow.getWeight());
		System.out.println(Cow.getlegs());
	}
	
}
