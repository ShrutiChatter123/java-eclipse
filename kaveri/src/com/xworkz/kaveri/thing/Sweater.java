package com.xworkz.kaveri.thing;

public class Sweater {

	public String shop;
	public int cost;
	public Zip zip;
	
	public Sweater() {
		System.out.println("no-arg constructor sweater");
	
	}
	
	public Sweater(String shop,int cost) {
		this.shop=shop;
		this.cost=cost;
	}
	
	
	public void init(Zip zip) {
		this.zip=zip;
	}
	
	
	public void display() {
		System.out.println("shop:"+this.shop);
		System.out.println("cost:"+this.cost);
		if(zip!=null) {
			this.zip.display();
		}else {
			System.err.println("this zip is not pointing to memory");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
