package com.xworkz.kaveri.thing;

public class Doctor {

	public String name;
	public String[] specilizations;
	public double experience;

	public Doctor() {
		System.out.println("no org constructor to Doctor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecilizations(String[] specilizations) {
		this.specilizations = specilizations;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("experience:" + experience);
		
		
	if(this. specilizations!=null ){
		for (int seq = 0; seq < specilizations.length; seq++) {
			String element=this.specilizations[seq];
			
			System.out.println("specilizations: " +element+"at index"+seq);
		}
	}else {
		System.out.println("this.specilization is not pointing to any memory");
	}
	
	}
	
	
}
