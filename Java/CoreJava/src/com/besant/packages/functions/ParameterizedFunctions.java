package com.besant.packages.functions;

public class ParameterizedFunctions {

	public static void main(String[] args) {
		System.out.println(addNumbers(10,20));//we call it arguments when we call the functions
		int output = addNumbers(7,56);
		System.out.println(output);
		System.out.println("name to uppercase");
		System.out.println(nameToUpper("qwertyuio"));

	}
	static int addNumbers(int num1, int num2) { //we call it parameters when we create a function
		int result = num1 + num2;
		return result;
	}

	static String nameToUpper(String name) {
		return name.toUpperCase();
	}
}
