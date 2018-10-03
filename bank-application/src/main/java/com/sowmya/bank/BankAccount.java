package com.sowmya.bank;

/** Documentation
 * 
 * @author sr52
 * @since 03-10-2018
 *
 */

//object or instance of BankAccount cannot be made,but its reference can be obtained.
public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	/* Method-1
	 * public BankAccount() {
		accountNo=1;
		accountHolderName="Unknown";
		accountBalance=0;
	}  OR */
	
	//init block
	{
		accountNo=++autoAccountNoGen;
	}
	
	public BankAccount() {
		//accountNo=++autoAccountNoGen;
		accountHolderName="Unknown";
		accountBalance=0;
	}
	
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		//accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	/*Method-1(w) => Normal method
	 * public void withdraw(double amount) {
		accountBalance-=amount;
	}*/
	
	public abstract void withdraw(double amount);
	public void deposit(double amount) {
		accountBalance+=amount;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public static int getAutoAccountNoGen() {
		return autoAccountNoGen;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
}
