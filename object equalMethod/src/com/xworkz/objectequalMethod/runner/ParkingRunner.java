package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Parking;

public class ParkingRunner {

	public static void main(String[] args) {

		Parking park=new Parking("Banglore", 543);
		System.out.println(park);
		
		Parking park1=new Parking("Bagalkot", 3434);
		System.out.println(park1);
		
		Parking park2=new Parking("Bagalkot", 3434);
		System.out.println(park2);
		
		
		
		boolean boom = park.equals(park1);
		System.out.println(boom);
		
		boolean boom1 = park1.equals(park2);
		System.out.println(boom1);
		
		
		
	}

}
