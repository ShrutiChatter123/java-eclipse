package com.xworkz.inheritancemethods.thing;

public class Roti {

	private String shape;
	
	public Roti() {
		System.out.println("no -org constructor");
	}
	
	public Roti(String shape) {
		this.shape=shape;
		System.out.println("String in roti");
		System.out.println(this.shape);
	}
	
	
	public String getShape() {
		return shape;
	}
	
	
	
	
	
	
	
}
