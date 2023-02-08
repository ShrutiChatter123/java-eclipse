package com.xworkz.kaveri.thing;

import com.xworkz.kaveri.boot.Isro;
import com.xworkz.kaveri.boot.Scientist;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro=new Isro();
		
		String[] locs={"banglore","Delhi","manglore"};
		isro.setlocation(locs);
		
		
		int[]satNos= {4,5,6};
		isro.setsatteliteNo(satNos);
		
		Scientist scientist=new Scientist();
		scientist.setName("abdul kalam");
		scientist.setdesignation("senior scientist");
		
		Scientist scientist1=new Scientist();
		scientist1.setName("homi bhabhu");
		scientist1.setdesignation("Director");
		
		Scientist[] ref = {scientist, scientist1};
		isro.setScientists(ref);
		
		isro.display();
		
		

	}

}
