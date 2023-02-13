package com.xworkz.association.thing;

public class Encapsulation2 {

	private String name;
	private int cost;
	private boolean marry;
	private double mobileNumber;
	
	
	public Encapsulation2() {
		System.out.println("created encapsulation2");
	}
	public Encapsulation2(String name,int cost, boolean marry,double mobileNumber) {
		this.name=name;
		this.cost=cost;
		this.marry=marry;
		this.mobileNumber=mobileNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public void setMarry(boolean marry) {
		this.marry=marry;
	}
	public boolean getMarry() {
		return marry;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	
	public void show() {
		System.out.println("name is :"+this.name);
		System.out.println("cost is:"+this.cost);
		System.out.println("marry is:"+this.marry);
		System.out.println("mobileNumber is:"+this.mobileNumber);
	}
	
}
