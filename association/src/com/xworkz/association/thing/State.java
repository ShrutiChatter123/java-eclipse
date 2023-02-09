package com.xworkz.association.thing;

public class State {

	public String name;
	public String cmName;
	public String language;
	public City city;
	
	
	public void setState(String name,String cmName,String language) {
		this.name=name;
		this.cmName=cmName;
		this.language=language;
		
	}
	public void setCity(City city) {
		this.city=city;
	}
	
	
	public void display() {
		System.out.println("state name is:"+this.name);
		System.out.println("cmName is:"+this.cmName);
		System.out.println("language in state:"+this.language);
	
		if(this.city!=null) {
			this.city.display();
		}else {
			System.out.println("this.city is not pointing to any memory");
		}
		
		
	}
	
	
	
	
	
}
