package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.java.Education;

public class EducationRunner {

	public static void main(String[] args) {
	
		 Education  education = new  Education ();
		 education.setBranch("engineering");
		 education.setCost(150000);
		 education.seteducationMinistar("ashwathnarayan");
		 
		 education.getBranch();
		 education.getCost();
		 education.geteducationMinistar();
		 
		 education.display();

	}

}
