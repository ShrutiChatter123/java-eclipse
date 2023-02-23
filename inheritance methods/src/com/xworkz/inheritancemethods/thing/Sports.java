package com.xworkz.inheritancemethods.thing;

 	public class Sports {

 	private String skills;
	
	public Sports() {
		System.out.println("no-org constructor");
	}
	
	public Sports(String skills) {
		this.skills=skills;
		System.out.println("skills achivement is done in sports");
		System.out.println(this.skills);
	}
	
	public  String getSkills() {
		return skills;
	}

	
	
}
