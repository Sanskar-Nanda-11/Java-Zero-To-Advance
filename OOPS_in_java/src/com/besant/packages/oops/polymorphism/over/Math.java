package com.besant.packages.oops.polymorphism.over;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int additions = addition(50,60,70);
		int additins = addition(50,60,70,90);
		System.out.println(additions);
		System.out.println(additins);
	}
	
	static int addition( int num1 , int num2 , int num3) {
		return  num1+num2+num3;
	}
	
	static int addition(int num1 , int num2 , int num3 ,int num4 ) {
		return num1+num2+num3+num4;
	}
	
	static int addition( int num1 , int num2 ) {
		return num1+num2;
	}
}
