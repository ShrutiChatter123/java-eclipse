package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.Baloon;
import com.xworkz.polymorphismoverridingmethod.thing.WaterBaloon;

public class BaloonRunner {

	public static void main(String[] args) {

		Baloon baloon=new WaterBaloon();
		baloon.Capacity();
		
		Baloon baloon1=new WaterBaloon();
		baloon1.Strength();
		
		
	}

}
