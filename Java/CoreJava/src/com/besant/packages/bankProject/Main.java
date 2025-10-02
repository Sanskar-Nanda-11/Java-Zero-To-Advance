package com.besant.packages.bankProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome user!");
		account();
		
	}
	static void account() {
		AccountOperations balance = new AccountOperations();
		System.out.println("");
		System.out.println("Enter the operation you want to perform : ");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("4.Exit");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int amount;
		
		switch(userInput) {
		case 1 : 
			System.out.println("Please enter the amount you would like to deposit : ");
			amount = sc.nextInt();
			balance.deposit(amount);
			account();
			break;
		case 2:
			if(balance.getAmount() == 0) {
				System.err.println("Your balance is 0, please make a deposit before you withdraw");
			}
			else {
				System.out.println("Please enter the amount you would like to withdraw : ");
				amount = sc.nextInt();
				balance.withdraw(amount);
			}
			account();
			break;
		case 3:
			balance.accBalance();
			account();
			break;
		case 4:
			System.out.println("Thank you for banking with us!");
			break;
		default:
			System.err.println("Invalid input! Try again!");
			account();
			break;
		}
	}
}
