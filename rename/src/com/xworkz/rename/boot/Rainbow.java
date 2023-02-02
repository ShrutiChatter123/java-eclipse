package com.xworkz.rename.boot;

public class Rainbow {

	public String name;
	public String colore;
	public int time;
	public boolean bright;
	public String location;
	public double length;
	public String viwer;

	



public Rainbow(String name,String colore,int time,boolean bright,String location,double length,String viwer) {
		this.name=name;
		this.colore=colore;
		this.time=time;
		this.bright=bright;
		this.location=location;
		this.length=length;
		this.viwer=viwer;
		
		
	}
	
	
	public void display() {
		System.out.println(name);
		System.out.println(colore);
		System.out.println(time);
		System.out.println(bright);
		System.out.println(location);
		System.out.println(length);
		System.out.println(viwer);
		
		
	}
	
	
	
}
