package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park park=new Park("Kabban Park", true, 44, 43222, "Head Worker", 12);
		System.out.println(park);
		
		System.out.println("===========================");
		
		Park park1=new Park("Lalbag", true, 543, 5443465, "Sub wrkers", 33);
		System.out.println(park1);
		 
		
		System.out.println("=========================");
		
		
		Park park2=new Park("Lalbag", true, 543, 5443465, "Sub wrkers", 33);
		System.out.println(park2);
		
		System.out.println("==============================");
		
		
		boolean boo=park.equals(park1);
		System.out.println(boo);
		System.out.println("==========================");
		
		
		boolean boo1=park1.equals(park2);
		System.out.println(boo1);
		
		
	}
	

}
