package com.besant.conditional;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4 ;
		int b = 3 ; 
		int c = 7 ;
		int d = 9 ;
		if( a >= b  && c <= d ) {
			System.out.println(" Right ");
		}else {
			System.out.println(" Wrong ");
		}
		
		if ( a <= c || d >= b ) {
			System.out.println(" True ");
		}else {
			System.out.println(" False ");
		}
	}

}
