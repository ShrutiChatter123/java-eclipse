package com.xworkz.polymorphismoverridingmethod.boot;

import com.xworkz.polymorphismoverridingmethod.thing.PaniPuri;
import com.xworkz.polymorphismoverridingmethod.thing.Puri;

public class PuriRunner {

	public static void main(String[] args) {

	Puri puri=new PaniPuri();
	puri.Softness();
	
	Puri puri1=new PaniPuri();
	puri1.OilFree();
	}

}
