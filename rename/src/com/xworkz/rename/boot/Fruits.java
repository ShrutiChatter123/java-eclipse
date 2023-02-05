package com.xworkz.rename.boot;

public class Fruits {

	public String name;
	public int cost;
	public String shop;
	public String owner;
	public boolean validity;
	public String buyer;
	
	public Fruits() {
		System.out.println("starting from fruits");
		
	}
	
	public Fruits(String name,int cost,String shop,String owner,boolean validity,String buyer) {
		
		super();
		this.name=name;
		this.cost=cost;
		this.shop=shop;
		this.owner=owner;
		this.validity=validity;
		this.buyer=buyer;
	}
	
	public Fruits(String name) {
		this.name=name;
	}
	public Fruits(int cost) {
		this.cost=cost;
	}
	public Fruits(String name,String shop) {
		this(name);
		this.shop=shop;
	}
	public Fruits(String owner,int cost,String name) {
	
		this.name=name;
	}
	public Fruits(String name,int cost,String shop,String owner) {
		this.owner=owner;
	}
	
	
	
	
	
}
