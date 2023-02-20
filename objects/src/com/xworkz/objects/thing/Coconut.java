package com.xworkz.objects.thing;

public class Coconut {
	
	private String shop;
	private int cost;
	private String colore;
	private String shape;
	
	public Coconut() {
		System.out.println("no-org");
	}
	
	public void setShop(String shop) {
		this.shop = shop;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String getShop() {
		return shop;
	}
	
	public String getColore() {
		return colore;
	}
	
	public int getCost() {
		return cost;
	}
	
	public String getShape() {
		return shape;
	}
	
	
	@Override
	public String toString() {
		return " this Shop:" + shop + "this.colore:" + colore + "this.Cost:" + cost + "this.Shape:"+ shape;
	}
	@Override
	public int hashCode() {
		return 78987;
	}
	
	
	
	
	
	
	
	
	
	

}
