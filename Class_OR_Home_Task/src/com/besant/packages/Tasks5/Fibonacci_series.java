package com.besant.packages.Tasks5;

//import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int first_number1 = 0;
		int second_number1 = 1 ;
		
		for(int d = 1; d<=15; d++) {
			int sum = first_number1 + second_number1;
			first_number1 = second_number1 ;
			second_number1 = sum;
			System.out.print(" "+ sum);
		}
	}

	
	
	
	
	
	
		// TODO Auto-generated method stub
//		Scanner md = new Scanner(System.in);
//		System.out.println(" Enter The Number To Get Its Fibonacci Series ");
//		int num = md.nextInt();
//		System.out.println(num);
//		int first_number ;
//		int second_number ;
//		System.out.println(first_number + " ");
//		System.out.println(second_number);
		
//		for(int d = 1; d<=15; d++) {
//			int sum = first_number + second_number;
//			first_number = second_number;
//			second_number = sum;
//			System.out.print(" "+ sum);
//		}
	}


