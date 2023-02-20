package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.BankAccount;
import com.xworkz.polymorphismoverridingmethod.thing.CurrenAccount;
import com.xworkz.polymorphismoverridingmethod.thing.SavingAccount;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount();
		account.display();
		
System.out.println("----------------");
		BankAccount bankaccount=new CurrenAccount();
		System.out.println(bankaccount.totalvisitars());
		account.display();
		CurrenAccount casted=(CurrenAccount) bankaccount;
		casted.response();
		
		
		System.out.println("-------------");
		
		CurrenAccount curentaccount=new CurrenAccount();
		curentaccount.display();
		System.out.println(curentaccount.response());
		
		System.out.println("--------");

		BankAccount bankaccount1=new SavingAccount();
		System.out.println(bankaccount1.totalvisitars());
		account.display();
		SavingAccount casted1=(SavingAccount) bankaccount1;
		casted1.salary();
		
		System.out.println("-----------------");
		
		SavingAccount savingaccount=new SavingAccount();
		savingaccount.display();
		System.out.println(savingaccount.salary());
		
		System.out.println("-------------------");
		










	}

}
