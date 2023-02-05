package com.xworkz.rename.boot;

public class Building {

	public String name;
	public int cost;
	public String location;
	public int budget;
	public boolean validity;
	public String owner;
	
	
	
	public Building () {
		System.out.println("starting with Building");
	}
	
	
	public Building (String name) {
		this.name=name;
	}
	
	public Building(String name,int cost,String location) {
		this(name);
		this.cost=cost;
		this.location=location;
	}
	
	public Building( String name,int cost,String location,int budget) {
		this(name,cost,location);
		this.budget=budget;
		
	}
	
	public Building(String name,int cost,String location,boolean validity) {
		this(name,cost,location);
		this.validity=validity;
	}
	
	public Building (String name,int cost, String location, int budget,String owner) {
		this(name,cost,location,budget);
		this.owner=owner;
	}
	
	

	public void init(String name,int cost,String location,int budget,boolean validity,String owner) {
		this.name=name;
		this.cost=cost;
		this.location=location;
		this.budget=budget;
		this.validity=validity;
		this.owner=owner;
		
			
	}
	public void display() {
		
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("location:"+location);
		System.out.println("budget:"+budget);
		System.out.println("validity:"+validity);
		System.out.println("owner:"+owner);
		
	}
	
}
