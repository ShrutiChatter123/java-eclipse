package com.xworkz.association.thing;

public class Mall {

	public String name;
	public boolean ambience;
	public int totalFloors;
	public Security security;
	public MallFamousFor famous;
	
	public Mall() {
		System.out.println("no-org construction to mall");
	}
	
public void setmall(String name,boolean ambience,int totalFloor, MallFamousFor famous) {
		this.name=name;
		this.ambience=ambience;
		this.totalFloors=totalFloor;
		this.famous=famous;
	}
	public void setsecurity(Security security) {
		this.security=security;
	}
	
	
	public void display() {
		System.out.println("Mall name is:"+this.name);
		System.out.println("Mall ambience is:"+this. ambience);
		System.out.println("Mall totalFloor no:"+this.totalFloors);
		System.out.println("Mall famous for :"+this.famous);
		
		
		if(this.security!=null) {
			this.security.display();
		}else {
			System.out.println("this.security is not pointing to any memory");
		}
		
		
	}
	
	
	
	
	
	
	
}
