package com.xworkz.polymorphismoverridingmethod.thing;

public class PineGarland extends GarLand {

	public PineGarland() {
		System.out.println("no-org constructor");
	}
	
	
	@Override
	public void Band() {
		System.out.println("band provides importsnce in band");
		
	}
	
	
}
