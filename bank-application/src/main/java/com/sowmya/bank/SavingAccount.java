package com.sowmya.bank;

public class SavingAccount extends BankAccount {
	
	@Override
	public void withdraw(double amount) {
		accountBalance-=amount;
		System.out.println("SavingsAccount withdraw method executed: Balance = "+accountBalance);
	}
	

}


