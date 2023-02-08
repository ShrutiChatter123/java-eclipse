package com.xworkz.kaveri.thing;

public class Degree {
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;

	public Degree() {
		System.out.println("no-org constructor degree");
	}

	public void setname(String name, int duration, boolean pursuing, double percentage, String branch) {
		this.name = name;
		this.duration = duration;
		this.pursuing = pursuing;
		this.percentage = percentage;
		this.branch = branch;
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("duration:" + duration);
		System.out.println("pursuing:" + pursuing);
		System.out.println("percentage:" + percentage);
		System.out.println("branch:" + branch);

	}

}
