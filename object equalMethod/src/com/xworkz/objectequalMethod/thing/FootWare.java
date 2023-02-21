package com.xworkz.objectequalMethod.thing;

public class FootWare {

	private String brand;
	private int size;
	private String type;

	public FootWare(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in FootWare" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof FootWare) {
				System.out.println("Obj is FootWare");
				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;
				if (left.brand.equals(right.brand) && left.size == right.size && left.type == right.type) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.err.println("left and right are not equal");
				}
			} else {
				System.err.println("obj is not FootWare");
			}

		} else {
			System.err.println("obj is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "brand:" + this.brand + "\nSize:" + this.size + "\ntype:" + this.type;
	}

}
