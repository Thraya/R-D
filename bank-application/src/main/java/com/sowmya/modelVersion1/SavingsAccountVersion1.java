package com.sowmya.modelVersion1;

import com.sowmya.bank.SavingAccount;
import com.sowmya.model.Insurance;

public class SavingsAccountVersion1 extends SavingAccount implements Insurance {
	
	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

	@Override
	public void getInsuranceId() {
		System.out.println("Insurance Id of SavingAccount = 1");
		
	}

	@Override
	public void getInsuranceName() {
		System.out.println("Insurance Name of CurrentAccount = Bajaj");
		
	}

	@Override
	public void getInsuranceAmount() {
		System.out.println("Insurance Amount = 500000");
		
	}

}
