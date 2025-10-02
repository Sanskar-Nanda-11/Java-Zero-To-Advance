package com.besant.packages.functions;

public class Main {

	public static void main(String[] args) {
		System.out.println(getName()); //calling or invoking of a function
		System.out.println(getAge());
		System.out.println("Full details(void function) : ");
//		System.out.println(getDetails()); Void functions cannot be printed
		
		getDetails(); //we can directly call the functions with void return type
		
		//to get array values
		System.out.println("Get age array : ");
		int[] array1 = getAgeArray();
		for(int i : array1) {
			System.out.print(i + " ");
		}
	}
	
	static String getName() {
		return "Rak";
	}
	
	static int getAge() {
		System.out.println("I am inside of getAge function!");
		return 25;
	}
	
	static void getDetails() {
		System.out.println(getName());
		System.out.println(getAge());
	}
	
	static int[] getAgeArray() {
		int[] age = {2,3,4,5,6};
		return age;
	}
}
