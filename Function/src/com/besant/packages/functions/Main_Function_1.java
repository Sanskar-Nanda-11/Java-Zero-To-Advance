package com.besant.packages.functions;

public class Main_Function_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addition(50 , 60)); // parsing value inside a function 
//		System.out.println(output);
		System.out.println(addition(41 , 60));
		
		
		System.out.println(adding( 50 , 70 ));
	}
	
	static int addition( int num1 , int num2 ) {
		int result = num1 + num2;
		return result;
	}
	
	static byte adding ( int num11 , int num22 ) {  // parsing values from the function declaration value mentions
		byte resulting = (byte) ( num11 + num22);   // here byte written means conversion from int to byte at a time
		return resulting;
	}
	
	String Name() {
		String Name= " Sanskr ";
		Name.toUpperCase();
		return Name;
	}

}
