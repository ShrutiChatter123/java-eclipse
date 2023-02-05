package com.xworkz.rename.thing;

import com.xworkz.rename.boot.Train;

public class TrainRunner {

	public static void main(String[] args) {
		Train Train=new Train("Duronto express");
		Train.display();
		System.out.println("   ");

		Train Train1=new Train("2345");
		Train.display();
		System.out.println(" ");
		
		Train Train2=new Train("Duronto express","raichur");
		Train.display();
		System.out.println("  ");
		
		Train Train3=new Train(12.3,"banglore");
		Train.display();
		System.out.println("  ");
		
		
		
		
		
		
		
		
		
	}

}
