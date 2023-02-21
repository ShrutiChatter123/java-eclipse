package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStation station = new PoliceStation("Banglore", "twenty", "Rakicolore", 7, 44, 8, "karnataka", "bagalkot",
				"bandook", 13);
		System.out.println(station);

		PoliceStation station1 = new PoliceStation("bagalkot", "33", "RakiColore", 5, 14, 9, "karnataka", "bagalkot",
				"bandook", 7);
		System.out.println(station1);

		PoliceStation station2 = new PoliceStation("bagalkot", "33", "RakiColore", 5, 14, 9, "karnataka", "bagalkot",
				"bandook", 7);
		System.out.println(station2);

		boolean b = station.equals(station1);
		System.out.println(b);

		boolean b1 = station1.equals(station2);
		System.out.println(b1);

	}

}
