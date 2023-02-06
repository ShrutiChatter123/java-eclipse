package com.xworkz.kaveri.boot;

public class Engine {

	public int density;
	public int budget;
	public int cost;
	
	
	public void init(int density,int budget,int cos) {
		this.density=density;
		this.budget=budget;
		this.cost=cost;
	}
	public void display() {
		System.out.println("density:"+density);
		System.out.println("budget:"+budget);
		System.out.println("cost:"+cost);
	}
	
}
