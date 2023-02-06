package com.xworkz.kaveri.boot;

public class Camera {

	public String name;
	public int cost;
	public int pixel;

	public void init(String name, int cost, int pixel) {
		this.name = name;
		this.cost = cost;
		this.pixel = pixel;

	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("cost:" + cost);
		System.out.println("pixel:" + pixel);
	}

}
