package com.xworkz.kaveri.thing;

public class Sun {

	public String name;
	public String energy;
	public boolean constant;


public Sun(String name,String energy,boolean constant) {
	this.name=name;
	this.energy=energy;
	this.constant=constant;
}

public void display() {
	System.out.println("name:"+this.name);
	System.out.println("energy:"+this.energy);
	System.out.println("constant:"+this.constant);
	
	
	
}

}