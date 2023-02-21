package com.xworkz.objectequalMethod.thing;

public class Fish {

	private String name;
	private int cost;
	private String shop;
	private String colore;
	private boolean lifetime;

	public Fish(String name, int cost, String shop, String colore, Boolean lifeTime) {
		this.name = name;
		this.cost = cost;
		this.shop = shop;
		this.colore = colore;
		this.lifetime = lifeTime;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running obj in Fish" + obj);
		if (obj!= null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("Obj is fish");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.name.equals(right.name) && left.cost == right.cost && left.shop == right.shop
						&& left.colore == right.colore && left.lifetime == right.lifetime) {
					System.err.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("Fish is not obj");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\ncost:" + this.cost + "\nshop:" + this.shop + "\ncolore:" + this.colore + "\nlifetime:"
				+ this.lifetime;
	}

}
