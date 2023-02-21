package com.xworkz.objectequalMethod.thing;

public class WaterFall {

	private String name;
	private int height;
	private String location;

	public WaterFall(String name, int height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("waterfall is running in equal" + obj);
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof WaterFall) {
				System.out.println("obj is WaterFall");
				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.equals(right.name) && left.height == right.height && left.location == right.location) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}
			} else {
				System.out.println("obj is not WaterFall");
			}

		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nheight:" + this.height + "\nlocation:" + this.location;
	}

}
