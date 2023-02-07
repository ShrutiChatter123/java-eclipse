package com.xworkz.kaveri.thing;

public class Glass {

	public String brand;
	public String shape;
	
	
	public Glass(String brand,String shape) {
		this.brand=brand;
		this.shape=shape;
	}
	
	public void display() {
		System.out.println("brand:"+this.brand);
		System.out.println("shape:"+this.shape);
	}
	
	
	
	
}
