package com.xworkz.kaveri.boot;

public class Button {

	public String colore;
	public boolean validity;
	public String shop;

	public void init(String colore, boolean validity, String shop) {
		this.colore = colore;
		this.validity = validity;
		this.shop = shop;
	}

	public void display() {
		System.out.println("colore:" + colore);
		System.out.println("validity:" + validity);
		System.out.println("shop:" + shop);
	}

}
