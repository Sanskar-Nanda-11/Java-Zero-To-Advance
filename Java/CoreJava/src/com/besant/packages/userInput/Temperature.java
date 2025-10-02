package com.besant.packages.userInput;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		int temperature = sc.nextInt();
		if(temperature < 0) {
			System.out.println("It is Cold!");
		}else if(temperature >= 0 && temperature <= 15) {
			System.out.println("It is Cool!");
		}else if(temperature >= 16 && temperature <= 30) {
			System.out.println("It is Warm!");
		}else{
			System.out.println("It is Hot!");
		}
	}

}
