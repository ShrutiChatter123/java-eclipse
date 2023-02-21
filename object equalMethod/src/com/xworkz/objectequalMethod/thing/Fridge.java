package com.xworkz.objectequalMethod.thing;

public class Fridge {

	private String name;
	private String shop;
	private String shopOwner;
	private String location;
	private String colore;
	private boolean validity;
	private boolean noFadeColore;
	private int cost;
	private Double budget;
	private String importedFrom;
	private String logo;
	private long cardCode; 
	
	
	public Fridge(String name,String shop,String sgopOwner,String location,String colore,boolean validity,boolean noFadeColore,int cost,double budget,String importedFrom,String logo,long cardCode){
		this.name=name;
		this.shop=shop;
		this.shopOwner=shopOwner;
		this.location=location;
		this.colore=colore;
		this.validity= validity;
		this.noFadeColore=noFadeColore;
		this.cost=cost;
		this.budget=budget;
		this.importedFrom=importedFrom;
		this.logo=logo;
		this.cardCode=cardCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Obj is running in Fridge"+obj);
		if(obj!=null) {
			System.out.println("obj is not null");
			if(obj instanceof Fridge) {
				System.out.println("Object is  fridge");
				Fridge casted=(Fridge)obj;
				Fridge left=this;
				Fridge right=casted;
				
				if(left.name.equals(right.name) && left.shop==right.shop && left.shopOwner==right.shopOwner && left.location==right.location && left.colore==right.location && left.colore==right.colore && left.validity==right.validity && left.noFadeColore==right.noFadeColore && left.cost==right.cost && left.budget==right.budget && left.importedFrom==right.importedFrom && left.logo==right.logo && left.cardCode==right.cardCode) {
					System.err.println("left is equal right");
					return true;
				}else {
					System.err.println("left is not equal to right");
				}
			
		}else {
			System.err.println("Obj is not a Fridge..");
		}
		}else {
			System.err.println("Fridge is null");
		}	
			
		
		return super.equals(obj);
	}
	
	
	@Override
	public String toString() {
		return "name:"+this.name
				+"shop:"+this.shop+ "\nshopOwner:"+this.shopOwner +
				"\nlocation:"+this.location + "\nColore:"+this.colore +
				"\nvalidity:"+ this.validity + "\nnoFadeColore:"+this.noFadeColore +
				"\nCost:"+this.cost + "\nbudget:"+this.budget + "\nimportedFrom:"+this.importedFrom +
				"\nlogo:"+ this.logo+ "\ncardcode:"+this.cardCode;
	}
	
	
	
	}
	

