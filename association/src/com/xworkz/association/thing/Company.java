package com.xworkz.association.thing;

public class Company {

	public String name;
	public String ceoName;
	public int since;
	public String address;
	public CompanyType type;
	
	
	
	
	public Company() {
		System.out.println("No-org constructor to company");
	}
	
	public void setcompany(String name,String ceoName,int since,String address, CompanyType type) {
		this.name=name;
		this.ceoName=ceoName;
		this.since=since;
		this.address=address;
		this.type=type;
	}
	
	public void display() {
		System.out.println("comany name is :"+this.name);
		System.out.println("company ceoName is :"+this.ceoName);
		System.out.println("company since from:"+this.since);
		System.out.println("company address is:"+this.address);
		System.out.println("company type is:"+this.type);
	}
	
	
}
