package com.xworkz.association.thing;

public class City {

	public String name;
	public String district;
	public String capital;
	public Area area;
	
	public City() {
		System.out.println("no org constructor");
	}
	
	public void setcity(String name,String district,String capital) {
		
	this.name=name;
	this.district=district;
	this.capital=capital;
	
	}
	public void setArea(Area area) {
		this.area=area;
	}
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("district:"+this.district);
		System.out.println("capital:"+this.capital);
		
		if(this.area!=null) {
			this.area.display();
		}else {
			System.out.println("this.area is not pointing to any memory");
		}
		
		
	}
	
	
	
	
	
	
	
}
