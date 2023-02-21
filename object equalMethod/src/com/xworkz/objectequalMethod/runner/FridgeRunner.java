package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge=new Fridge("Samsung", "PVR", "Harsh", "rajajinagar", "gray", true, true, 56564, 765543, "bijapur", "rounded", 43223);
		System.out.println(fridge);
		
		System.out.println("==========================");
		
		Fridge fridge1=new Fridge("LG", "vascoo", "charanrao", "bagalkot", "red", true, true, 4400, 34343, "Raibag", "WaterDrop", 3232);
		System.out.println(fridge1);
		
		System.out.println("=====================");
		
		Fridge fridge2=new Fridge("LG", "vascoo", "charanrao", "bagalkot", "red", true, true, 4400, 34343, "Raibag", "WaterDrop", 3232);
		System.out.println(fridge2);
		
		System.out.println("====================");
		
		boolean ref=fridge.equals(fridge1);
		System.out.println(ref);
		
		System.out.println("========================");
		
		boolean ref1=fridge1.equals(fridge2);
		System.out.println(ref1);
		
		
		
		
		
		
	}

}
