package com.besant.packages.arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ways to create or define an array 
		int [] array1 = { 1, 2, 3, 4, 5, 7, 3};
		System.out.println(array1[3]);
		array1[3] = 8;
		
		for ( int i = 0; i < array1.length; i++) {
			// prints the whole array 
			System.out.print(array1[i]);
		}
		
		System.out.println(array1[3]);
		
		
		// other ways 
		int[] array2 = new int[3];
		array2[0] = 5;
		
		for(int i = 0 ; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		
		// enhanced for loop 
		for ( int j : array2 ) {
			System.out.println(j);
		}
	}

}
