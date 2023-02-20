package com.xworkz.objects.thing;

public class Pipe {

	private String name;
	private int cost;
	private String shop;
	private double budget;

	public Pipe() {
		System.out.println("no-org");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public String getShop() {
		return shop;
	}

	public double getBudget() {
		return budget;
	}

	@Override
	public String toString() {
		return "this name:" + name + "this.cost:" + cost + "this.shop:" + shop + " this.Budget:" + budget;
	}
	
	@Override
	public int hashCode() {
		return 2000;
	}

}
