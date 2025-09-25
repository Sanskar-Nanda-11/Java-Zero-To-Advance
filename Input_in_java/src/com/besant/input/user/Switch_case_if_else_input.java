package com.besant.input.user;

import java.util.Scanner;

public class Switch_case_if_else_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sj = new Scanner (System.in);
		System.out.println(" Enter You Day : ");
		String days = sj.nextLine();
		System.out.println(" Your Days is " + days);
		if( days.equals("Monday")) {
			System.out.println(" This is monday ");
		}else if( days.equals("Tuesday")){
			System.out.println(" This is tueday ");
		}else if( days.equals("Wednesday")){
			System.out.println(" This is Wednesday ");
		}else if( days.equals("Thursday")){
			System.out.println(" This is Thursday ");
		}else if( days.equals("Friday")){
			System.out.println(" This is Friday ");
		}else if( days.equals("Saturday")){
			System.out.println(" This is Saturday  ");
		}else if( days.equals("Sunday")){
			System.out.println(" This is Sunday ");
		}else {
			System.out.println(" Not A Number ");
		}
		
		switch (days){
			case "Monday" :
				System.out.println(" Happy Monday From Switch ");
				break;
			case "Tuesday" :
				System.out.println(" Happy Tuesday From Switch ");
				break;
			case "Wednesday" :
				System.out.println(" Happy Wednesday From Switch ");
				break;
			case "Thursday" :
				System.out.println(" Happy Thursday From Switch ");
				break;
			case "Friday" :
				System.out.println(" Happy Friday From Switch ");
				break;
			case "Saturday" :
				System.out.println(" Happy Saturday From Switch ");
				break;
			case "Sunday" :
				System.out.println(" Happy Sunday From Switch ");
				break;
		}

	}

}
