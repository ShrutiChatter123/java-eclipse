package com.xworkz.inheritancemetods.boot;

import com.xworkz.inheritancemethods.thing.Camera;
import com.xworkz.inheritancemethods.thing.Device;

public class DeviceRunner {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.clickPhoto();
		String brand = camera.getBrand();
		camera.getBrand();

		Device device = new Device("Nikon");
		String brand1 = device.getBrand();
		System.out.println(brand1);

		Device device1 = new Camera();
		String brand2 = device1.getBrand();
		System.out.println(brand2);

		Camera camera1 = (Camera) device1;
		camera1.clickPhoto();

	}

}
