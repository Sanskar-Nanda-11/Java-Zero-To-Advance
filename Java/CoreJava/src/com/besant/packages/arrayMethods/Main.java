package com.besant.packages.arrayMethods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = arr.length - i;
		}
//		System.out.println(arr[6]);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		//Array sorting
		Arrays.sort(arr);
		System.out.println("");
		System.out.println("After sorting : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		System.out.println(" ");
		for(int i : arr1) {
			System.out.print(i + " ");
		}
	}

}
