package com.xworkz.polymorphismoverridingmethod.thing;

public class PaniPuri extends Puri {

	public PaniPuri() {
		System.out.println("no-org constructor");

	}

	@Override
	public void OilFree() {
		System.out.println("puri contains lesser oil");
	}

}
