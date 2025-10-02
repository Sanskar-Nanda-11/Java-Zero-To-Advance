package com.besant.packages.operators;

public class Main {
//arithmetic operators (+ , - , / , * , % )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 50;
		
		int addition = num1 + num2;
		System.out.println(addition);
		
		int subtraction = num1 - num2;
		System.out.println(subtraction);

		int multiplication = num1 * num2;
		System.out.println(multiplication);
//		
		int division = num1 / num2;
		System.out.println(division);
//		output will be 0 because datatype is int if the result is 0.something
		
		System.out.println(11 % 2);
//		this will give the remainder
		
//		System.out.println(11/0);
//		this will give arithmetic exception
		
//		converting celcius to farenheight
		int celcius = 28;
		int fahrenheit = (celcius * 9/5) + 32;
		System.out.println("The temperature of "+celcius +" degrees in Fahrenheit is : ");
		System.out.println(fahrenheit);
		
//		Relational operations
		int num3 = 10;
		int num4 = 20;
		String name = "ram";
		String name1 = "rama";
		System.out.println("Relational operators numbers output :");
		System.out.println(num3 > num4);
		System.out.println(num3 < num4);
		System.out.println(num3 >= num4);
		System.out.println(num3 <= num4);
		System.out.println(num3 == num4);
		System.out.println(num3 != num4);
		System.out.println("Relational operators String output :");
		System.out.println(name1 == name);
		System.out.println(name1 != name);
		
		System.out.println(name.equals(name1));
		
		
	}

}
