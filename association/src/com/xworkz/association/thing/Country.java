package com.xworkz.association.thing;

public class Country {

	public String name;
	public String president;
	public String developed;
	public State state;
	
	
	public void setCountry(String name,String president,String developed) {
		this.name=name;
		this.president=president;
		this.developed=developed;
	}
	public void setState(State state) {
		this.state= state;
	}
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("president:"+this.president);
		System.out.println("developed:"+this.developed);
		
		if(this.state!=null) {
			this.state.display();
		}else {
			System.out.println("this.state is not pointing to any memory");
		}
		
		
		
		
	}
	
	
	
	
	
	
}
