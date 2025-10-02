package com.besant.packages.loops;

public class Main {

	public static void main(String[] args) {
		//Program to print numbers from 1 to 10
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++; //it will go to infinite loop if we don't give any increment or decrement statement 
		}
		
		//Program to print 10 to 0
		System.out.println("");
		System.out.println("do while loop : ");
		int j = 10;
		do {
			System.out.print(j + " "); //this is executed 1 time and then the while condition is checked
			j--; //j=j-1
		}while(j >= 0);
		
		System.out.println("");
		System.out.println("for loop : ");
		for(int k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println("");
		for(int m=1;m<=10;m++) {
			for(int n=1;n<=m;n++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		//Create a code to get multiplication table using any of the loops 
		
		//Print characters from 'a' to 'z'
	}

}
