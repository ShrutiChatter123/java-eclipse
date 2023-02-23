package com.xworkz.inheritancemethods.thing;

public class Camera extends Device {

	public Camera() {
		System.out.println("no org constructor");
	}

	public Camera(String brand) {

		super(brand);
	}

	public void clickPhoto() {
		System.out.println("running clic photo in camera");
	}

}
