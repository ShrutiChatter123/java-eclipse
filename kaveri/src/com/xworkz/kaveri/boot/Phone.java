package com.xworkz.kaveri.boot;

public class Phone {

	public String shop;
	public int cost;
	public boolean validity;
	public Camera Camera=new Camera();

	public void inti(String shop, int cost, boolean validity) {
		this.shop = shop;
		this.cost = cost;
		this.validity = validity;

	}

	public void display() {
		System.out.println("shop:" + shop);
		System.out.println("cost:" + cost);
		System.out.println("validity:" + validity);
		this.Camera.display();
	}

}
