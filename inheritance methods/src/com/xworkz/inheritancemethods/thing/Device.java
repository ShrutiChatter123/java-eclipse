package com.xworkz.inheritancemethods.thing;

public class Device {

	private String brand;

	public Device() {
		System.out.println("no org constructor of device");
	}

	public Device(String brand) {
		this.brand = brand;
		System.out.println("String in device");
		System.out.println(this.brand);
	}

	public String getBrand() {
		return brand;
	}

}
