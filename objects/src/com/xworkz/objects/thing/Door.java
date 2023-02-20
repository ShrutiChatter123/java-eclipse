package com.xworkz.objects.thing;

public class Door {

	private String wood;
	private String shop;
	private double price;
	private String colore;

	public Door() {
		System.out.println("no-org");
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getWood() {
		return wood;
	}

	public String getShop() {
		return shop;
	}

	public String getColore() {
		return colore;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "this.wood:" + wood + "this.shop:" + shop + "this.colore:" + colore + "this.price:" + price;
	}
	
	@Override
	public int hashCode() {
		return 2333;
	}

}
