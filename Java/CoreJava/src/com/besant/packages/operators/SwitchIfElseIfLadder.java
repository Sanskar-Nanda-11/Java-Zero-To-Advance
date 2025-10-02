package com.besant.packages.operators;

import java.util.Scanner;

public class SwitchIfElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day : ");
		String day = sc.nextLine();
		System.out.println("Your day is :");
		// == will not work when checking with user input because it checks for reference instead of value, so we use .equals() instead, which checks for value
		if(day.equals("monday")) {
			System.out.println("Happy Monday");
		}else if(day.equals("tuesday")) {
			System.out.println("Happy Tuesday");
		}else if(day.equals("wednesday")) {
			System.out.println("Happy wednesday");
		}else if(day.equals("thursday")) {
			System.out.println("Happy thursday");
		}else if(day.equals("friday")) {
			System.out.println("Happy friday");
		}else if(day.equals("saturday")) {
			System.out.println("Happy saturday");
		}else if(day.equals("sunday")) {
			System.out.println("Happy sunday");
		}else {
			System.out.println("Invalid day!");
		}
		
		switch (day) {
		case "monday": 
			System.out.println("Happy monday from switch");
			break;
		case "tuesday": 
			System.out.println("Happy tuesday from switch");
			break;
		case "wednesday": 
			System.out.println("Happy wednesday from switch");
			break;
		case "thursday": 
			System.out.println("Happy thursday from switch");
			break;
		case "friday": 
			System.out.println("Happy friday from switch");
			break;
		case "saturday": 
			System.out.println("Happy saturday from switch");
			break;
		case "sunday": 
			System.out.println("Happy sunday from switch");
			break;
		default:
			System.out.println("Invalid day from switch");
		}
	}

}
