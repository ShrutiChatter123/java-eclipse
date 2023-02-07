package com.xworkz.kaveri.thing;

public class Sunrise {

public int timing;
public String colore;
public String location;
public Sun sun;

public Sunrise() {
	System.out.println("no-org const sunrise");
}

public Sunrise(int timing,String colore,String location) {
	this.timing=timing;
	this.colore=colore;
	this.location=location;
}
public void init(Sun sun) {
	this.sun=sun;
}

public void display() {
	System.out.println("timing:"+this.timing);
	System.out.println("colore:"+this.colore);
	System.out.println("location:"+this.location);
	
	if(sun!=null) {
		this.sun.display();
	}else{
		System.err.println("this sun is not pointing to memory");
	}
	
}













}
