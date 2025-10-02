package com.besant.packages.loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Program to get multiplication table using user input
		System.out.println("Enter the number you want multiplication table for :");
		int number = sc.nextInt();
		int i = 1;
		System.out.println("Enter the number of times : ");
		int times = sc.nextInt();
		while(i <= times) {
			System.out.println(number + " x " + i + " = " + number*i);
			i++;
		}
		
		//Program to print alphabets a to z
		System.out.println("");
		for(char j = 'a'; j <= 'z'; j++) {
			System.out.print(j + " ");
		}
		
	}

}
