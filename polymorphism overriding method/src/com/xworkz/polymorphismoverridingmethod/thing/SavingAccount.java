package com.xworkz.polymorphismoverridingmethod.thing;

public class SavingAccount extends BankAccount {

	public String name="corporation";
	
	public SavingAccount() {
		System.out.println("no-org constructor");
	}
	
	public double salary() {
		return 343444;
	}
	
	public void display() {
		System.out.println("name:"+name);
	}
	
	
	
	
	
	
}
