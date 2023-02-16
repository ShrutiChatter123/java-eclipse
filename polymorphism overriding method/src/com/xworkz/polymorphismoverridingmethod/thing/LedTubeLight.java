package com.xworkz.polymorphismoverridingmethod.thing;

public class LedTubeLight extends TubeLight {

	public LedTubeLight() {
		System.out.println("no-org constructor");
	}
	
	@Override
	public void Validation() {
		System.out.println("tubelight valid till march");
	}
	
	
	
}
