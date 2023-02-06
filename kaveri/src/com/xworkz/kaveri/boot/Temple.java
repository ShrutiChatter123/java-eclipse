package com.xworkz.kaveri.boot;

public class Temple {

	public String god;
	public String location;
	public int entryFees;
	public God God=new God();

	public void init(String god, String location, int entryFees) {
		this.god = god;
		this.location = location;
		this.entryFees = entryFees;
	}

	public void display() {
		System.out.println("god : " + god);
		System.out.println("location : " + location);
		System.out.println("entryFees : " + entryFees);
		this.God.display();
	}

}
