package com.xworkz.rename.boot;

public class Place {

	public String location;
	public int population;
	public String district;
	public String state;
	public String country;

	
	public Place() {
		
		System.out.println("started from place");
		
		}
	
	public Place(String location,int population,String district,String state,String country) {
		super();
		this.location=location;
		this.population=population;
		this.district=district;
		this.state=state;
		this.country=country;
		
		
	}
	public Place(String location) {
	
		this.location=location;
	}
	
	public Place(int population) {
		
		this.population=population;
	}
	
	public Place(int population,String district) {
		this(population);
		this.district=district;
		
	}
	
	
	public Place(String state,int population) {
		this(population);
		this.state=state;
		
	}
	
	public Place(String state,String country) {
		this.state=state;
		this.country=country;
	}
	
	
	public void init(String location,int population,String district,String state,String country) {
		this.location=location;
		this.population=population;
		this.district=district;
		this.state=state;
		this.country=country;
	}
	
	public void display() {
		
		System.out.println("display data");
		System.out.println("location:"+this.location);
		System.out.println("population:"+this.population);
		System.out.println("district:"+this.district);
		System.out.println("state:"+this.state);
		System.out.println("country:"+this.country);
		
	}
	
	
	
	
}








