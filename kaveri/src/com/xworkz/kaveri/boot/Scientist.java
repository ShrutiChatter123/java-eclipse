package com.xworkz.kaveri.boot;

public class Scientist {

	public String name;
	public String designation;
	
	public Scientist() {
		System.out.println("No -org constrctor Scientist");
	}

	public void setName(String name) {
		this.name =name;
	}
	
	public void setdesignation(String designation) {
		this.designation =designation;
	}
	
	public void display() {
		System.out.println("detailes of scientist..");
		System.out.println(this.name);
	}
	
	
	
	
	
	
	
	
}
