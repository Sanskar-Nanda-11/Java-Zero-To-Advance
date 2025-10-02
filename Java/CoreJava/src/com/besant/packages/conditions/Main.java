package com.besant.packages.conditions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//using single conditions
		System.out.println("Voter age check! Enter your age :");
		byte age = sc.nextByte();
		if (age >= 18) {
			System.out.println("Can Vote!");
		}else {
			System.out.println("Cannot Vote!");
		}
		
		//using multiple conditions
		System.out.println("");
		System.out.println("Condition to check if you want to attend the class(true/false) :");
		System.out.println("Want to learn java?");
		boolean learnJava = sc.nextBoolean();
		System.out.println("Want to get a job?");
		boolean getJob = sc.nextBoolean();
		System.out.println("No other plan?");
		boolean noOtherPlan = sc.nextBoolean();
		
		if(learnJava && getJob && noOtherPlan) {
			System.out.println("Attend todays class!");
		}else {
			System.out.println("Will not attend today's class!");
		}
		
		//Condition to check given number is even or odd
		System.out.println("");
		System.out.println("Enter the number to check if even or odd :");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " is Even");
		}else {
			System.out.println(number + " is Odd");
		}
		
		System.out.println("");
		System.out.println("Voter conditions check(true/false):");
		System.out.println("Do you have Aadhar card?");
		boolean aadhar = sc.nextBoolean();
		System.out.println("Do you have Voter ID?");
		boolean voterId = sc.nextBoolean();
		System.out.println("Do you have Driving License?");
		boolean drivingLicence = sc.nextBoolean();
		System.out.println("Do you have Pan card?");
		boolean pan = sc.nextBoolean();
		//will get executed if any one of the condition is true
		if( aadhar || voterId || drivingLicence || pan ) { 
			System.out.println("Eligible for casting vote.");
		}else {
			System.out.println("Ineligible for casting vote.");
		}
		
		//Check whether given character is a vowel 
		System.out.println("");
		System.out.println("Enter a character to check if vowel or not : ");
		char alphabet = sc.next().charAt(0);
		if(alphabet == 'a' || alphabet =='A' || alphabet =='e' || alphabet =='E' || alphabet =='i' || alphabet =='I' || alphabet =='o' || alphabet =='O'|| alphabet =='u' || alphabet =='U') {
			System.out.println(alphabet + " is a vowel");
		}else {
			System.out.println(alphabet + " is not a vowel");
		}
		
		//check whether given number is positive or negative
		System.out.println("");
		System.out.println("Enter the number to check if positive or negative :");
		int number1 = sc.nextInt();
		if(number1 == 0) {
			System.out.println(number1 + " is neither positive or negative");
		}else if(number1 > 0) {
			System.out.println(number1 + " is positive");
		}else {
			System.out.println(number1 + " is negative");
		}	
	}
}
