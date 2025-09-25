package com.besant.packages.wrapperClasses;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Compile time error :- strings s;
		
//		run time error :- System.out.println(10/0);
		
		
//		Logical errors
		
//		System.out.println(add (10 , 50));
		
		
		
		
//		System.out.println("hi");
//		System.out.println(" hello ");
//		System.out.println(10/0); // here broken 
//		System.out.println("Finished");
		
		

		try {
			System.out.println(10/0); // here broken 
		} catch (Exception e) {
			// TODO: handle exception
//			e.
			System.err.println(" Error ");
		}
		
		System.out.println("Finished");
		
	}
	
//	private static int add ( int a , int b ) {
//		return a - b;
//	}
	
	

}
