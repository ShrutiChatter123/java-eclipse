package com.xworkz.polymorphismoverridingmethod.thing;

public class CurrenAccount extends BankAccount {

	public String name="SBI";
	
	
	public CurrenAccount() {
		System.out.println("no org constructor in");
	}
	
	
	public boolean response() {
		return true;
	}
	
	public void display() {
		System.out.println("name:"+name);
	}
}
