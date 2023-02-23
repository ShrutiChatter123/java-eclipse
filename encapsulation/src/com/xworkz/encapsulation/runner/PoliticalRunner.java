package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.java.Political;

public class PoliticalRunner {

	public static void main(String[] args) {

		Political poli=new Political();
		poli.setLocation("Banglore");
		poli.setNoOfParticipates(34);
		poli.setFemaleParticipates(65);
		poli.setEndDate(true);
		
		poli.getLocation();
		poli.getNoOfParticipates();
		poli.getFemaleParticipates();
		poli.isendDate();
		
		
		poli.display();
		
		
		
	}

}
