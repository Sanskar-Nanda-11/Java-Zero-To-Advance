package com.besant.packages.functions;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		calculator();
	}
	//Recursive function - calculator is called again after a operation is performed
	static void calculator() {
		System.out.println("Choose the operation :");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Stop");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int number1;
		int number2;
		
		switch(userInput) {
		case 1 :
			System.out.println("Enter the first number :");
			number1 = sc.nextInt();
			System.out.println("Enter the second number :");
			number2 = sc.nextInt();
			System.out.println("The result is :");
			System.out.println(addNumber(number1,number2));
			calculator();
			break;
		case 2 :
			System.out.println("Enter the first number :");
			number1 = sc.nextInt();
			System.out.println("Enter the second number :");
			number2 = sc.nextInt();
			System.out.println("The result is :");
			System.out.println(subtractNumber(number1,number2));
			calculator();
			break;
		case 3 :
			System.out.println("Enter the first number :");
			number1 = sc.nextInt();
			System.out.println("Enter the second number :");
			number2 = sc.nextInt();
			System.out.println("The result is :");
			System.out.println(multiplyNumber(number1,number2));
			calculator();
			break;
		case 4 :
			System.out.println("Enter the first number :");
			number1 = sc.nextInt();
			System.out.println("Enter the second number :");
			number2 = sc.nextInt();
			System.out.println("The result is :");
			System.out.println(divideNumber(number1,number2));
			calculator();
			break;
		case 5 :
			System.out.println("Thank you!");
			break;
		default:
			System.err.println("Invalid input");
			calculator();
			break;
			}
	}
	static int addNumber(int number1, int number2) {
		return number1 + number2;
	}
	static int subtractNumber(int number1, int number2) {
		return number1 - number2;
	}
	static int multiplyNumber(int number1, int number2) {
		return number1 * number2;
	}
	static float divideNumber(int number1, int number2) {
		return (float)number1 / number2;
	}
}
