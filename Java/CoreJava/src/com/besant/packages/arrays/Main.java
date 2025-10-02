package com.besant.packages.arrays;

public class Main {

	public static void main(String[] args) {
//		ways  to create arrays
//		1st way
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(array1[6]);
		
		//to print the entire array
		for(int i=0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
//		2nd way
		int[] array2 = new int[3];
		array2[2] = 7;
		System.out.println("");
//		for(int j=0 ; j < array2.length; j++) {
//			System.out.print(array2[j] + " "); //0 will be default value if we dont assign anything in int in an array
//		}
		
		//enhanced for loop
		for(int j : array2) {
			System.out.print(j + " ");
		}
	}

}
