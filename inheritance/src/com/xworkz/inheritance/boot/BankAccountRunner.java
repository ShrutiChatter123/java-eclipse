package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.BankAccount;
import com.xworkz.inheritance.thing.CurrentBankAccount;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		 BankAccount   bankAccount =new  BankAccount ();
		 bankAccount.deposit(50000);
		 bankAccount.widrow(10000);
		 System.out.println("my balance is "+  bankAccount.getBalance() );
		 
		 System.out.println("----------------------------------");
		 
		 
		 
		 
		 
		
		 CurrentBankAccount currentBankAccount = new CurrentBankAccount ();
		 currentBankAccount.deposit(689090);
		 currentBankAccount.widrow(43443);
		 System.out.println("my balance is "+currentBankAccount.getBalance() );
	
	
	
	
	
	
	}

}
