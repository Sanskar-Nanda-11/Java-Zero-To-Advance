package com.besant.packages.userInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
	}

}
