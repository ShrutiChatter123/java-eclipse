package com.xworkz.polymorphismoverridingmethod.thing;

public class WallClock extends Clock {

	public WallClock() {
		System.out.println("no-org consrtuctor");
	}
	
	@Override
	public void Speed() {
		System.out.println("highspeed");
	}
	
	
	
}
