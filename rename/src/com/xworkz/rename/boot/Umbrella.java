package com.xworkz.rename.boot;

public class Umbrella {

	public String name;
	public int cost;
	public String seller;
	public int budget;
	public String shop;
	public double length;
	public boolean guarantee;
	public float height;
	public String material;
	public int width;
		
		
	
public Umbrella(String name,int cost,String seller,int budget,String shop, double length ,boolean guarantee,float height,String material, int width) {

		
		this.name=name;
		this.cost=cost;
		this.seller=seller;
		this.budget=budget;
		this.shop=shop;
		this.length=length;
		this.guarantee=guarantee;
		this.height=height;
		this.material=material;
		this.width=width;
		
}
	public void display() {
		
		System.out.println(name);
		System.out.println(cost);
		System.out.println(seller);
		System.out.println(budget);
		System.out.println(shop);
		System.out.println(length);
		System.out.println(guarantee);
		System.out.println(height);
		System.out.println(material);
		System.out.println(width);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
