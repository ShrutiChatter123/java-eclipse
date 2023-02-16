package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.LedTubeLight;
import com.xworkz.polymorphismoverridingmethod.thing.TubeLight;

public class TubeLightRunner {

	public static void main(String[] args) {

		TubeLight tubelight=new LedTubeLight();
		tubelight.Validation();
		
		TubeLight tubelight1=new LedTubeLight();
		tubelight1.Quality();
		
	}

}
