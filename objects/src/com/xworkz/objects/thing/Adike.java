package com.xworkz.objects.thing;

public class Adike {

	private String colore;
	private int cost;
	private boolean validity;
	private String manufacturedBy;

	public Adike() {
		System.out.println("no-org");
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setValidity(boolean validity) {
		this.validity = validity;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public String getColore() {
		return colore;
	}

	public int getCost() {
		return cost;
	}

	public boolean isValidity() {
		return validity;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	@Override
	public String toString() {
		return "this.Colore:" + colore + "this.Cost:" + cost + "this.validity:" + validity + " this.ManufacturedBy:"
				+ manufacturedBy;
	}

	@Override
	public int hashCode() {
		return 1234;
	}
}
