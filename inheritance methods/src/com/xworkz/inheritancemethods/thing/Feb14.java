package com.xworkz.inheritancemethods.thing;

public class Feb14 extends ValentineDay {

	public Feb14() {
		System.out.println("no-org constructor");
	}
	
	public Feb14(Boolean loversDay) {
		
		super(loversDay);
	}
	
	
	public void celebrationDay() {
		System.out.println("running celebrationDay in Feb14");
	}
	
	
	
	
	
	
	
	
}
