package com.xworkz.objectequalMethod.thing;

public class Cake {

	private String flavour;
	private int weight;
	private String shape;
	private double price;

	public Cake(String flavoure, int weight, String shape, double price) {

		this.flavour = flavoure;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equal is running in cake" + obj);

		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Cake) {
				System.out.println("Obj is Cake");
				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.weight == right.weight && left.shape == right.shape
						&& left.price == right.price) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left and right are not equal");
				}

			} else {
				System.err.println("obj is not Cake");
			}

		} else {
			System.err.println("obj is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "flavoure:" + this.flavour + "weight:" + this.weight + "shape:" + this.shape + "price:" + this.price;
	}

}
