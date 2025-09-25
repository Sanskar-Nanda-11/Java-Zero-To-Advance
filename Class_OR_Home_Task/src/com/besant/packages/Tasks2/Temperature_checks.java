package com.besant.packages.Tasks2;

import java.util.Scanner;

public class Temperature_checks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temp = new Scanner (System.in);
		System.out.println(" Enter Your Temperature ");
		int tempp = temp.nextInt();
		System.out.println(" Your Temperature is " + tempp );
		if(tempp < 0) {
			System.out.println(" Temperature Below Zero !");
		}else if(tempp > 0 && tempp < 15) {
			System.out.println(" Temperature between zero to fifteen ");
		}else if(tempp > 16 && tempp < 30) {
			System.out.println(" Temperature Between Sixteen to Thirty ");
		}else if(tempp > 30) {
			System.out.println(" Temperature Above Thirty ");
		}
	}

}
