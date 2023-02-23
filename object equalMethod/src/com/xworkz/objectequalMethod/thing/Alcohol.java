package com.xworkz.objectequalMethod.thing;

public class Alcohol {

	private String brand;
	private int percentage;
	private double price;
	private String type;

	public Alcohol(String brand, int percentage, double price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is running in Alcohol" + obj);
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof Alcohol) {
				System.out.println("Obj is Alcohol");
				Alcohol casted = (Alcohol) obj;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.percentage == right.percentage && left.price == right.price
						&& left.type == right.type) {
					System.err.println("left is equal to right");
					return true;
				} else {
					System.out.println("left and rigt are not same");
				}
			} else {
				System.out.println("obj is not Alcohol");
			}
		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "brand:" + this.brand + "\npercentage:" + this.percentage + "\nprice:" + this.price + "\ntype:"
				+ this.type;
	}

}