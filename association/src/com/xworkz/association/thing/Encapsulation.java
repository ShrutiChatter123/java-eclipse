package com.xworkz.association.thing;

public class Encapsulation {

	private String name;
	private int age;
	private String wifName;
	private String address;
	private long mobileNumber;
	
	public Encapsulation() {
		System.out.println("created  Encapsulation");
	}
	
	public Encapsulation(String name, int age, String wifName,String address,long mobileNumber ) {
		this.name=name;
		this.age=age;
		this.wifName=wifName;
		this.address=address;
		this.mobileNumber=mobileNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setWifeName(String wifeName) {
		this.wifName=wifeName;
	}
	public String getWifeName() {
		return wifName;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	
	public long getmobileNumber() {
		return mobileNumber;
	}
	
	public void display() {
		System.out.println(name + " " + age + " " + wifName + " "+ address + " " + mobileNumber);
	}

	
	
	
}
