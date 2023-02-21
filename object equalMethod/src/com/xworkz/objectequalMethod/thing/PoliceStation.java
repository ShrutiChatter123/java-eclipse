package com.xworkz.objectequalMethod.thing;

public class PoliceStation {

	private String location;
	private String noOfPolice;
	private String dressColore;
	private int noOfLadyPolice;
	private int noOfTrees;
	private int malePolice;
	private String state;
	private String district;
	private String weapons;
	private int vehicles;

	public PoliceStation(String location, String noOfpolice, String fressColore, int nooLadyPolice, int noOfTrees,
			int malePolice, String state, String district, String weapons, int vehicless) {

		this.location = location;
		this.noOfPolice = noOfPolice;
		this.dressColore = dressColore;
		this.noOfLadyPolice = noOfLadyPolice;
		this.noOfTrees = noOfTrees;
		this.malePolice = malePolice;
		this.state = state;
		this.district = district;
		this.weapons = weapons;
		this.vehicles = vehicless;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running obj in policeStation" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof PoliceStation) {
				System.out.println("Obj is PoliceStation");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation left = this;
				PoliceStation right = casted;

				if (left.location.equals(right.location) && left.noOfPolice == right.noOfPolice
						&& left.dressColore == right.dressColore && left.noOfLadyPolice == right.noOfLadyPolice
						&& left.noOfTrees == right.noOfTrees && left.malePolice == right.malePolice
						&& left.state == right.state && left.district == right.district && left.weapons == right.weapons
						&& left.vehicles == right.vehicles) {
					System.err.println("leftis equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("PoliceStaion is not obj");
			}
		} else {
			System.err.println("Obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "location:" + this.location + "\nnoOfPolice:" + this.noOfPolice + "\ndressColore:" + this.dressColore
				+ "\nnoOfLadyPolice:" + this.noOfLadyPolice + "\nnoOfTrees:" + this.noOfTrees + "\nmalePolice:"
				+ this.malePolice + "\nstate:" + this.state + "\ndistrict:" + this.district + "\nweapons:"
				+ this.weapons + "\nvehicless:" + this.vehicles;
	}

}
