package com.xworkz.objects.thing;

public class SugarCane {

	private String name;
	private double budget;
	private String owner;
	private String location;

	public SugarCane() {
		System.out.println("no-org");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public String getOwner() {
		return owner;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "this name:" + name + "this budget:" + budget + "trhis.owner:" + owner + "this.location:" + location;
	}

	@Override
	public int hashCode() {
		return 2020;
	}
	
	
	
	
	
	
	
	
	
}
