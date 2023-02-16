package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.Clock;

public class ClockRunner {

	public static void main(String[] args) {

	Clock clock=new Clock();
	clock.Speed();
	
	Clock clock1=new Clock();
	clock1.Working();
		
	}

}
