package com.besant.if_else;

public class Switch_And_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days = "Sunday";
		if( days == "Monday" ) {
			System.out.println(" This is monday ");
		}else if( days == "Tuesday" ){
			System.out.println(" This is tueday ");
		}else if( days == "Wednesday" ){
			System.out.println(" This is Wednesday ");
		}else if( days == "Thursday" ){
			System.out.println(" This is Thursday ");
		}else if( days == "Friday" ){
			System.out.println(" This is Friday ");
		}else if( days == " Saturday " ){
			System.out.println(" This is Saturday  ");
		}else if( days == "Sunday" ){
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
