package com.besant.packages.arrayMethods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {29, 64, 6, 24, 48, 11, 2, 9495, 39, 69, 84, 54, 56, 68, 45, 97, 72, 47, 57, 58, 73, 51, 82, 79}
;
		arr[4] = 5;
		
		System.out.println();
		Arrays.sort(arr);
		Arrays.fill(arr, 9);
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println(arr[0]);
	}

}
