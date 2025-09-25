package com.besant.conditional;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		if( input == -1) {
			System.out.println(input + " Neither negative nor postive ");
		}else if(input > 0) {
			System.out.println(input + " number is greater then zero ");
		}else {
			System.out.println(input + " number is lesser than zero ");
		}
	}

}
