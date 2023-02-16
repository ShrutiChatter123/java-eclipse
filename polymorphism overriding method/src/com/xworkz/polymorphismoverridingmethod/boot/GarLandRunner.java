package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.GarLand;
import com.xworkz.polymorphismoverridingmethod.thing.PineGarland;

public class GarLandRunner {

	public static void main(String[] args) {

		GarLand garland=new PineGarland();
		garland.Band();
		
		GarLand garland1=new PineGarland();
		garland1.Foliage();
	}

}
