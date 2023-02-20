package com.xworkz.objects.thing;

public class Paint {

	private String brand;
	private int cost;
	private String shop;
	private String owner;

	public Paint() {
		System.out.println("no-org constructor");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setOwner(String owner ) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public int getCost() {
		return cost;
	}

	public String getShop() {
		return shop;
	}

	public String getowner () {
		return owner;
	}

	@Override
	public String toString() {
		return "Brand:" + brand + "Cost:" + cost + "Shop:" + shop + "Owner:" + owner;
	}

	@Override
	public int hashCode() {

		return 555;
	}

}
