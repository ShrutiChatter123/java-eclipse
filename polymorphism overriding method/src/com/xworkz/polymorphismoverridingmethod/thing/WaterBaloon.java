package com.xworkz.polymorphismoverridingmethod.thing;

public class WaterBaloon extends Baloon {

	public WaterBaloon() {
		System.out.println("no-org constructor");
	}

	@Override
	public void Strength() {
		System.out.println("Strength indicates the baloon validation");
	}

}
