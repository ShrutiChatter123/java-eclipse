package com.xworkz.objectequalMethod.thing;

public class Parking {

	private String location;
	private int noVehicles;

	public Parking(String location, int noVehicles) {
		this.location = location;
		this.noVehicles = noVehicles;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running obj in parking" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Parking) {
				System.out.println("parking is obj");
				Parking Casted = (Parking) obj;
				Parking left = this;
				Parking right = Casted;
				if (left.location.equals(right.location) && left.noVehicles == right.noVehicles) {
					System.err.println("left and right pointings are same");
					return true;
				} else {
					System.err.println("left and right pointers are different");
				}
			} else {
				System.err.println("Parking is not a obj");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "location:" + this.location + "\nnoVehicles:" + this.noVehicles;
	}

}
