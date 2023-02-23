package com.xworkz.inheritancemethods.thing;

public class Alcohol {

	private String brand;
	
	public Alcohol() {
		System.out.println("no-org constructor to alchol");
	}
	
	public Alcohol(String brand) {
		this.brand=brand;
		System.out.println("starting with Alcohol");
		System.out.println(this.brand);
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
