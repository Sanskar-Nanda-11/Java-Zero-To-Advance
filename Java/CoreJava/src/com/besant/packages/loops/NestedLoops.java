package com.besant.packages.loops;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Nested for Loop example
		System.out.println("Nested loop example : ");
		for(int k = 0;k<5;k++) {
			for(int l=0;l<3;l++) {
				System.out.println(k + " " + l);
			}
		}
		
		//Print pyramid
		System.out.println("Pyramid : ");
		for(int m=1;m<10;m++) {
			for(int n=1;n<=m;n++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Print pyramid in center
		System.out.println("Pyramid in center : ");
		for(int s=1;s<=10;s++) {
			for(int t=1;t<=10-s;t++) {
				System.out.print(" ");
			}
			for(int u=1;u<=s;u++) {
				System.out.print("^ ");
			}
			System.out.println("");
		}
		
		for(int v=1;v<6;v++) {
			for(int x=1;x<7;x++) {
				System.out.print(" ");
			}
			for(int w=1;w<4;w++) {
				System.out.print("| ");
			}
			System.out.println("");
		}
		for(int y=1;y<10;y++) {
			System.out.print("- ");
		}
		//Print Square
		System.out.println("");
		System.out.println("Square : ");
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
				//OR
		//Print square
		System.out.println("Square : ");
		for(int o=1;o<=5;o++) {
			System.out.println(" * * * * * ");
		}
		
		//Task to print Fibonacci series
		System.out.println("Fibonacci series, Enter the number of sequence (upto 47):");
		//it exceeds the range of int after 47th sequence
		int sequence = sc.nextInt();
		int firstNum = 0;
		System.out.print(firstNum + " ");
		int secondNum = 1;
		System.out.print(secondNum);
		for(int r=1;r<=(sequence-2);r++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(" " + sum);
		}
	}

}
