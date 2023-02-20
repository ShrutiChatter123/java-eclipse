package com.xworkz.inheritancedemomethod.thing;

public class OnionMasalaRagiRoti extends OnionRagiRoti{

	public OnionMasalaRagiRoti() {

		System.out.println("no-org");
	}
	
	public int getThickNess() {
		System.out.println("thickness in roti");
		return 34;
	}
	
}
