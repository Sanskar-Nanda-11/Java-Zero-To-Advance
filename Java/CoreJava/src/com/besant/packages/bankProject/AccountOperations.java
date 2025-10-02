package com.besant.packages.bankProject;

public class AccountOperations implements AccountOptions{

	private static int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		AccountOperations.amount = amount;
	}

	@Override
	public void deposit(int amount) {
		if(amount < 100) {
			System.err.println("Minimum amount you can deposit : Rs 100");
		}else {
			setAmount(AccountOperations.amount + amount);
			System.out.println("Rs " + amount + " deposited!");
			System.out.println("Your updated balance is : Rs " + AccountOperations.amount);
		}
	}

	@Override
	public void withdraw(int amount) {
		if(amount < 100) {
			System.err.println("Minimum amount you can withdraw : Rs 100");
		}
		else if(AccountOperations.amount < amount) {
			System.err.println("Your balance is low, please withdraw from your available balance!");
			System.out.println("Your balance : " + AccountOperations.amount);
		}else {
			setAmount(AccountOperations.amount - amount);
			System.out.println("Rs " + amount + " withdrawn!");
			System.out.println("Your updated balance is : Rs " + AccountOperations.amount);
		}
		
	}

	@Override
	public void accBalance() {
		System.out.println("You account balance is : " + getAmount());
	}
	 
	
}
