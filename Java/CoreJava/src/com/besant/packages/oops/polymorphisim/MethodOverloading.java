package com.besant.packages.oops.polymorphisim;

public class MethodOverloading {

	static int add(int num1, int num2) {
		return num1 + num2;
	}
	static int add(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	public static void main(String[] args) {
		//method overloading
		System.out.println(add(2,6));
		System.out.println(add(3,4,65));
	}
	
}
