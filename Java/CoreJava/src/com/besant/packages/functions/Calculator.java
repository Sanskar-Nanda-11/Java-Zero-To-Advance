package com.besant.packages.functions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the operation you want to perform (+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		System.out.println("The result is : " + getCalculator(num1,num2,oper));
	}
	static int getCalculator(int num1,int num2,char oper) {
		switch(oper) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		default:
			System.err.println("Invalid input");
			return 0;
		}
	}
}
