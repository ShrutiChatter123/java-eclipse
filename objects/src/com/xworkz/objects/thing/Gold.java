package com.xworkz.objects.thing;

public class Gold {

	private String shop;
	private String location;
	private double price;
	private boolean quality;

	public Gold() {
		System.out.println("no-org");
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void isQuality(boolean quality) {
		this.quality = quality;
	}

	public String getShop() {
		return shop;
	}

	public String getLocation() {
		return location;
	}

	public double getPrice() {
		return price;
	}

	public boolean isquality() {
		return quality;
	}

	@Override
	public String toString() {
		return " this.Shop:" + shop + "this.location:" + location + "this.price:" + price + "this.quality:" + quality;
	}

	@Override
	public int hashCode() {
		return 1000;
	}
	
	
}
