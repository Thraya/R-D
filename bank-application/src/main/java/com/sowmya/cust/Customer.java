package com.sowmya.cust;

import com.sowmya.modelVersion1.CurrentAccountVersion1;
import com.sowmya.modelVersion1.SavingsAccountVersion1;

public class Customer {

	public static void main(String[] args) {
		/* Method-1 (normal access)
		 * BankAccount acc1=new BankAccount();
		acc1.withdraw(5000);
		BankAccount acc2=new BankAccount();
		BankAccount acc3=acc1;
		SavingAccount sc1=new SavingAccount();
		sc1.withdraw(5000);
		System.out.println("SavingsBankAccount" + sc1);
		System.out.println("BankAccount1" + acc1);
		System.out.println("BankAccount2" + acc2);
		System.out.println("BankAccount3" + acc3);
		 */
		
		/* Method-2 (abstract class)
		 * SavingAccount acc1=new SavingAccount();
		System.out.println(acc1);
		acc1.withdraw(5000);
		System.out.println(acc1);*/
		
		/*//Polymorphism
		BankAccount acc=null;
		acc = new SavingAccount();
		acc.withdraw(5000);
		// acc.IsSalaryAccount(); => IsSalaryAccount is not a part of bankAccount hence it cannot be accessed
*/		
		SavingsAccountVersion1 ac2=new SavingsAccountVersion1();
		ac2.getInsuranceId();
		ac2.getInsuranceName();
		ac2.getInsuranceAmount();
		ac2.withdraw(5000);
		
		//Accessing Interface methods
		CurrentAccountVersion1 ac1=new CurrentAccountVersion1();
		ac1.getInsuranceId();
		ac1.getInsuranceName();
		ac1.getInsuranceAmount();
		ac1.withdraw(3000);
		
	}

}
