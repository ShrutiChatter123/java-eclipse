package com.xworkz.association.boot;

import com.xworkz.association.thing.Encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName("abhi");
		encapsulation.setAge(44);
		encapsulation.setWifeName("ramavva");
		encapsulation.setAddress("near rajajinagar");
		encapsulation.setMobileNumber(9380532567L);
		
		encapsulation.getName();
		encapsulation.getAge();
		encapsulation.getWifeName();
		encapsulation.getAddress();
		encapsulation.getmobileNumber();

		//or  
		
		encapsulation.display();
		
		Encapsulation encap =new Encapsulation("MANJI", 56, "EDRFTG", "DRFTGYHU", 894658645l);
		 encap.getName();
		 encap.getAge();
		 encap.getWifeName();
		 encap.getAddress();
		 encap.getmobileNumber();
		
		
	}

}
