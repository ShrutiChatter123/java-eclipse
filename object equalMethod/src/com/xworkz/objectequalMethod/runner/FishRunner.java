package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish=new Fish("Star", 4444, "ShR SHOP", "Gold", false);
		System.out.println(fish);
		
		Fish fish1=new Fish("Swordfish", 333, "Ramraj pete", "ligt white", false);
		System.out.println(fish1);
		
		Fish fish2=new Fish("Swordfish", 333, "Ramraj pete", "ligt white", false);
		System.out.println(fish2);
		
		boolean ref=fish.equals(fish1);
		System.out.println(ref);
		
		boolean ref1=fish1.equals(fish2);
		System.out.println(ref1);
		
		
		
		
	}

}
