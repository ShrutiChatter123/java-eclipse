package com.xworkz.inheritancedemomethod.thing;

public class Naan extends ButterRoti {

	public Naan() {
		System.out.println("no-org");
	}
	
	public int getCost() {
		System.out.println("naan in price");
		return 4444;
	}
}
