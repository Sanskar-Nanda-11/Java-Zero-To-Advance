package com.besant.packages.functions;

import java.util.Scanner;

public class Main_Function_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			calculator();

		}
		
		static void calculator() {
			System.out.println(" Choose An Operation");
			System.out.println(" 1 , addition ");
			System.out.println(" 2 , substraction ");
			System.out.println(" 3 , multiplication ");
			System.out.println(" 4 , division ");
			System.out.println(" 5 , exit ");
			Scanner dk = new Scanner (System.in);
			int userInput = dk.nextInt();
			
			int number1;
			int number2;
			
			switch(userInput) {
			
			case 1:
				System.out.println(" Enter The First Number ");
				number1 = dk.nextInt();
				System.out.println(" Enter The Second Number ");
				number2 = dk.nextInt();
				System.out.println(" Your Result Is :- ");
				System.out.print(add(number1 , number2));
				calculator();
				break;
				
			case 2: 
				System.out.println(" Enter The First Number ");
				number1 = dk.nextInt();
				System.out.println(" Enter The Second Number ");
				number2 = dk.nextInt();
				System.out.println(" Your Result Is :- ");
				System.out.print(substract( number1 , number2));
				calculator();
				break;
				
			case 3:
				System.out.println(" Enter The First Number ");
				number1 = dk.nextInt();
				System.out.println(" Enter The Second Number ");
				number2 = dk.nextInt();
				System.out.println(" Your Result Is :- ");
				System.out.print(multiply( number1 , number2));
				calculator();
				break;
				
			case 4:
				System.out.println(" Enter The First Number ");
				number1 = dk.nextInt();
				System.out.println(" Enter The Second Number ");
				number2 = dk.nextInt();
				System.out.println(" Your Result Is :- ");
				System.out.print(divide( number1 , number2));
				calculator();
				break;
				
			case 5:
				System.out.println(" Thank You ");
				break;
			
			default :
				System.out.println(" Try Again ! ");
				calculator();
				break;
			}
		
		}
		
		static int add(int number1 , int number2) {
			int result = number1 + number2;
			return result;
		}
		
		static int substract(int number1 , int number2) {
			int result = number1 - number2;
			return result;
		}
		
		static int multiply(int number1 , int number2) {
			int result = number1 * number2;
			return result;
		}
		
		static int divide(int number1 , int number2) {
			int result = number1 / number2;
			return result;
		}

}
