package com.sowmya.modelVersion1;

import com.sowmya.bank.CurrentAccount;
import com.sowmya.model.Insurance;

public class CurrentAccountVersion1 extends CurrentAccount implements Insurance {

	@Override
	public void getInsuranceId() {
		System.out.println("Insurance Id of CurrentAccount = 1");
		
	}

	@Override
	public void getInsuranceName() {
		System.out.println("Insurance Name of CurrentAccount= LIC");
		
	}

	@Override
	public void getInsuranceAmount() {
		System.out.println("Insurance Amount = 500000");
		
	}

}
