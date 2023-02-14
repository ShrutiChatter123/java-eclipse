package com.xworkz.inheritancemethods.thing;

public class ValentineDay {

	private boolean loversDay;
	
	public ValentineDay() {
	System.out.println("no-org constructor...");	
	
	}
	public ValentineDay(boolean loversDay) {
		this.loversDay=loversDay;
		System.out.println("boolean in valentineDay");
		System.out.println(this.loversDay);
	}
	
	public boolean getLoversDay() {
		return loversDay;
		
		
	}
	
	
	
}
