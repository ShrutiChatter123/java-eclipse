package com.xworkz.rename.boot;

public class Burger {
	
public String colore;
public int cost;
public String shop;
public String seller;
public boolean good;
public String server;
public long seats;
public String preparedBy;
public String calories;
public String location;
public String owner;
public double weight;
public int year;
public double length;
public double energy;



public Burger(String colore, int cost,String shop,String seller,boolean good,String server,long seats,String preparedBy, double weight,String location,String owner,String calories,int year,double length,double energy  ) {
	
	this.colore=colore;
	this.cost=cost;
	this.shop=shop;
	this.seller=seller;
	this.good=good;
	this.server=server;
	this.seats=seats;
	this.preparedBy=preparedBy;
	this.calories= calories;
	this.location=location;
	this.owner=owner;
	this.weight=weight;
	this.year=year;
	this.length=length;
	this.energy=energy;
	
	

}





public void display() {
	System.out.println(colore);
	System.out.println(cost);
	System.out.println(shop);
	System.out.println(seller);
	System.out.println(good);
	System.out.println(server);
	System.out.println(seats);
	System.out.println(preparedBy);
	System.out.println(calories);
	System.out.println(location);
	System.out.println(owner);
	System.out.println(weight);
	System.out.println(year);
	System.out.println(length);
	System.out.println(energy);
	
	
	
	}





















}
