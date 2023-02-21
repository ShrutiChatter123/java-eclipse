package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		
		WaterFall fall=new WaterFall("Jog", 5432,"shivmogga");
		System.out.println(fall);
		
		WaterFall fall1=new WaterFall("ambulighat", 6787, "Ambuli");
		System.out.println(fall1);
		
		WaterFall fall2=new WaterFall("ambulighat", 6787, "Ambuli");
		System.out.println(fall2);
	
		
		boolean b1=fall.equals(fall1);
		System.out.println(b1);
		
		boolean b2=fall1.equals(fall2);
		System.out.println(b2);
		
		
		
		

	}

}
