package com.besant.packages.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		TataMotors nano = new TataMotors();
		nano.accelerate();
		nano.braking();
		
		Mahindra thar = new Mahindra();
		thar.accelerate();
		thar.braking();
	}

}
