package com.xworkz.kaveri.boot;

public class JawaBike {

	public int cost;
	public boolean validity;
	public String FuelConsumption;
	public Engine Engine=new Engine();
	
	public void init(int cost,boolean validity,String FuelConsumption) {
		this.cost=cost;
		this.validity=validity;
		this.FuelConsumption=FuelConsumption;
	}
	
	public void display() {
		System.out.println("cost:"+cost);
		System.out.println("validity:"+validity);
		System.out.println("FuelConsumption:"+FuelConsumption);
		this.Engine.display();
	}
	
	
}
