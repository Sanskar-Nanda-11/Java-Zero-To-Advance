package com.besant.packages.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		array1[2][0] = 7;
		array1[2][1] = 8;
		array1[2][2] = 9;
		for(int i = 0; i < 3; i++) {
			for(int j=0; j < 3; j++){
				System.out.print(array1[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("number of rows in the array is : " + array1.length);
		System.out.println("number of columns in the array is : " + array1[0].length);
//		for(int i : array1) {
//			for(int j : array1) {
//				System.out.println(array1[i][j]);
//			}
//		}
	}

}
