package com.xworkz.encapsulation.java;

public class ShoppingMall {

	private String name;
	private String location;
	private int budget;
	
	public ShoppingMall() {
		System.out.println(" created shopping mall");
	}
	
	public  ShoppingMall(String name, String location, int budget) {
		this.name=name;
		this.location=location;
		this.budget=budget;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setBudget(int budget) {
		this.budget=budget;
	}
	public int getBudget() {
		return budget;
	}
	
	public void display() {
		System.out.println(name + " "+ location + " " + budget);
	}
	
	
	
	
}
