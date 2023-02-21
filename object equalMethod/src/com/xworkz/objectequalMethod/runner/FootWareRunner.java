package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {
	
		FootWare foot=new FootWare("PaRaragan", 6, "boar round");
		System.out.println(foot);
		
		FootWare foot1=new FootWare("PUMA", 7, "blackshape");
		System.out.println(foot1);
		
		FootWare foot2=new FootWare("PUMA", 7, "blackshape");
		System.out.println(foot2);
		

		boolean ref=foot.equals(foot1);
		System.out.println(ref);
		
		boolean ref1=foot1.equals(foot2);
		System.out.println(ref1);
		
	}

}
