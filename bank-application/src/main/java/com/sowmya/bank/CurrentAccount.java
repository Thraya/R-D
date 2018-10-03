package com.sowmya.bank;


public class CurrentAccount extends BankAccount  {
			
	@Override 
	public void withdraw(double amount) {
		accountBalance-=amount;
		System.out.println("Balance Amount in CurrentAccount" + accountBalance );
	}
		
	
}
