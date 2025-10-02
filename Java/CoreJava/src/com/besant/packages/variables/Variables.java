package com.besant.packages.variables;

public class Variables {
//program to swap two numbers
//	variable naming convention
	//	always start with lowercase
	//	use camel case when there are multiple words eg-(firstName,lastName,phoneNumber)
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
//		type conversion
		int d= 6200;
		short e = (short)d;
		System.out.println(e);
		
//		this will result in data loss when we go from bigger datatype to smaller datatype
//		int d= 6200;
//		byte e = (byte)d;
//		System.out.println(e);
		
		int f = 20078999;
		float g = (float)f;
		System.out.println(g);
	}
	
}
