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
		for (int i = 0; i < specilizations.length; i++) {
			System.out.println("specilizations: " + specilizations[i]);
		}
	}

}
