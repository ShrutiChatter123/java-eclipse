package com.xworkz.inheritance.thing;

public class BankAccount {

	public String name;
	public int budget;
	public double balance;
	
	public double deposit(double balance) {
		System.out.println("ammount to be depositted" + balance);
		this.balance=this.balance + balance;
		return this.balance;
	}
	
	public double widrow(double balance) {
		System.out.println("ammount to be withdrow"+ balance);
		this.balance=this.balance - balance;
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
}
