package com.xworkz.rename.boot;

public class Frame {

	
	public String name;
	public int cost;
	public String material;
	public int width;
	public float size;
	public boolean good;
	public String date;
	public String location;
	public String colore;
	public String shop;
	public String owner;
	public int budget;
	
	
  public Frame(String name,int cost,String material,int width,float size,boolean good,String date,String location,String colore,String shop,String owner,int budget) {
	
	this.name=name;
	this.cost=cost;
	this.material=material;
	this.width=width;
	this.size=size;
	this.good=good;
	this.date=date;
	this.location=location;
	this.colore=colore;
	this.shop=shop;
	this.owner=owner;
	this.budget=budget;
	
	
}
	
	public void display() {
		
		System.out.println(name);
		System.out.println(cost);
		System.out.println(material);
		System.out.println(width);
		System.out.println(size);
		System.out.println(good);
		System.out.println(date);
		System.out.println(location);
		System.out.println(colore);
		System.out.println(shop);
		System.out.println(owner);
		System.out.println(budget);
		
		
	}
	
	
	
	
	
	
	
}

