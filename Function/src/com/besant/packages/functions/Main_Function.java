package com.besant.packages.functions;

public class Main_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getAge()); // calling or invoking a function
		System.out.println(" i will print after the main call ");
		System.out.println(getName());
//		System.out.println(getData());    // Void function can not be printed or written
		
		getData();  // we can directly call an function or void function
		
		getarray();
	}
	
	static String getName() {
		return "sanskar" ;
	}
	
	static int getAge() {
		System.out.println(" i am inside get age function ");
		System.out.println(" i am second line ");
		System.out.println(getName());
		return 55;
	}
	
	static void getData() {
		System.out.println(" My Name is ");
		System.out.println(" I am Second line ");
		System.out.println(" third ");
	}
	
	static void getarray(){
		int [] array23 = getAgeArray();
		
			
			for ( int i : array23) {
				System.out.println(i);
			}
	}
	
		static int[] getAgeArray(){
			int[] age = { 45 ,223 , 54 , 64};
			
			return age;

	}
	
}
