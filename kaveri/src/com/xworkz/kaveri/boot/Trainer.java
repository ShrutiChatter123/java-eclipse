package com.xworkz.kaveri.boot;

public class Trainer {

	public String owner;
	public int budget;
	public double salary;
	
	public void init(String owner,int budget,double salary) {
		this.owner=owner;
		this.budget=budget;
		this.salary=salary;
	
	}
	
	public void display() {
		System.out.println("owner:"+owner);
		System.out.println("budget:"+budget);
		System.out.println("salary:"+salary);
	}
	
	
	
	
	
	
	
	
	
}
