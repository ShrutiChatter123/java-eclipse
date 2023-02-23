package com.xworkz.objectequalMethod.thing;

public class Tv {

	private String brand;
	private double price;
	private int size;

	public Tv(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("Riunning equals in tv:" + arg);
		if (arg != null) {
			System.out.println("Arg is not null");
			if (arg instanceof Tv) {
				System.out.println("Arg is Tv");
				Tv casted = (Tv) arg;
				Tv left = this;
				Tv right = casted;

				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left is equals to reight");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.out.println("Arg is not a Tv..");
			}
		} else {
			System.out.println("Tv is null");

		}

		return super.equals(arg);

	}

	@Override
	public String toString() {
		return "brand:" + this.brand + "\nprice:" + this.price + "\nsize:" + this.size;
	}
	
	@Override
	public int hashCode() {
		return 545;
	}
	
	
	
	

}
