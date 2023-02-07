package com.xworkz.kaveri.thing;

public class Box {

	public String shape;
	public int cost;
	public String shop;
	
	
	public Box(String shape,int cost,String shop) {
		this.shape=shape;
		this.cost=cost;
		this.shop=shop;
	}
	
	public void display() {
		System.out.println("shape:"+this.shape);
		System.out.println("cost:"+this.cost);
		System.out.println("shop:"+this.shop);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
