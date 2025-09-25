package com.besant.input.user;

import java.util.Scanner;

public class Main_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cc = new Scanner( System.in);
		System.out.println(" Enter Your Name ");
		String name = cc.nextLine();
		System.out.println(" Enter Your Age ");
		int age = cc.nextInt();
		System.out.println(" Your Name is " + name );
		System.out.println(" Your Age is " + age );
	}

}
