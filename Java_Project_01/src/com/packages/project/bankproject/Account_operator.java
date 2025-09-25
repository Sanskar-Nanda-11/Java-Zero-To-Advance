package com.packages.project.bankproject;

public class Account_operator extends Account{
	
	private static int user_balance;

	public int getUser_balance() {
		return user_balance;
	}

	public static void setUser_balance(int user_balance) {
		Account_operator.user_balance = user_balance;
	}

	@Override
	void deposit(int balance) {
		// TODO Auto-generated method stub
		Account_operator.user_balance += balance;
	}

	@Override
	void withdraw(int balance) {
		// TODO Auto-generated method stub
		Account_operator.user_balance -= balance;
	}
	
}
