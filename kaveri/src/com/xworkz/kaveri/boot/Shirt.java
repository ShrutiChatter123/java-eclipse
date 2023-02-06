package com.xworkz.kaveri.boot;

public class Shirt {

	public String colore;
	public String brand;
	public int cost;
	public Button Button = new Button();

	public void init(String colore, String brand, int cost) {
		this.colore = colore;
		this.brand = brand;
		this.cost = cost;

	}

	public void display() {
		System.out.println("colore:" + colore);
		System.out.println("brand:" + brand);
		System.out.println("cost:" + cost);
		this.Button.display();
	}

}
