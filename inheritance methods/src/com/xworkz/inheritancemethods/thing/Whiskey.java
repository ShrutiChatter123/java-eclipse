package com.xworkz.inheritancemethods.thing;

public class Whiskey extends Alcohol {

	
	public Whiskey() {
		System.out.println("no org constructor ");
	}
	
	public Whiskey(String brand) {
		
		super(brand);
	}
	
	public void energyDrink() {
		System.out.println("running alcohol in whiskey");
	}
	
	
	
	
}
