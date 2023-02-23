package com.xworkz.inheritancemethods.thing;

public class CandyCrush extends Game {

	 
	public CandyCrush() {
		System.out.println("no org constructor");
	}
	
	
	public CandyCrush(String developer) {
		
		super(developer);
	}
	
	public void enterTainment() {
		System.out.println("Taking enertainment in CandyCrush");
	}
	
	
	
	
	
	
	
	
}
