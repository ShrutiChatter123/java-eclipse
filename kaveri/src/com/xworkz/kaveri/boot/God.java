package com.xworkz.kaveri.boot;

public class God {

	public String name;
	public String location;
	public String state;

	public void init(String name, String location, String state) {
		this.name = name;
		this.location = location;
		this.state = state;
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("location:" + location);
		System.out.println("state:" + state);
	}

}
