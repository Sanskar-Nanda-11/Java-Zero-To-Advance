package com.besant.packages.Tasks3;

import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(" Enter A Number Of Which you want to get the multiplication table ");
//		Scanner dj = new Scanner( System.in);
//		int df = dj.nextInt();
//		for(int s = 1 ; s <= 10 ; s++ ) {
//			int d = df*s;
//			System.out.println(df + "*" + s + "*" + "=" + d);
//		}
		
		// Nested For loop
		System.out.println("");
		for( int d = 1; d<= 5; d++) {
//			System.out.println("*");
			for(int s=1; s<d; s++) {
				System.out.println(d+" "+s);
			}
		}
		
		// Print Pyramid
		
		for( int s =1; s<=10; s++) {
			System.out.println(" ");
			for ( int df = 1; df<=s; df++) {
				System.out.print(" * ");
			}
		}
		
		
		System.out.println(" VOid Main ");
		for( int s =1; s<=10; s++) {
//			System.out.println(" * ");
//			for ( int df = 1; df==s; df++) {
				System.out.println(" ********** ");
//			}
		}
		
		// Print Addition using for loop
		
	}

}
