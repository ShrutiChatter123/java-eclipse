package com.xworkz.association.thing;

public class Area {

	public String name;
	public int population;
	public int  street;
	
	public Area (String name,int population,int street) {
		this.name=name;
		this.population=population;
		this.street=street;
	}
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("population:"+population);
		System.out.println("street:"+street);
	}
	
	
	
	
	
	
}
