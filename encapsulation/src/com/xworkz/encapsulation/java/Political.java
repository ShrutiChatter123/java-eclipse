package com.xworkz.encapsulation.java;

public class Political {

	private String location;
	private int noOfParticipates;
	private int femaleParticipates;
	private boolean endDate;
	
	
	public Political() {
		System.out.println("counting participates in political way");
	}
	
	public void Political(String location,int noOfParticipates,int femaleParticipates,boolean endDate) {
		
		this.location=location;
		this.noOfParticipates=noOfParticipates;
		this.femaleParticipates=femaleParticipates;
		this.endDate= endDate;
		
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setNoOfParticipates(int noOfParticipates) {
		this.noOfParticipates = noOfParticipates;
	}
	
	public void setFemaleParticipates(int femaleParticipates) {
		this.femaleParticipates = femaleParticipates;
	}
	
	public void setEndDate(boolean endDate) {
		this.endDate = endDate;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getNoOfParticipates() {
		return noOfParticipates;
	}
	
	public int getFemaleParticipates() {
		return femaleParticipates;
	}
	
	public boolean isendDate() {
		return endDate;
	}
	
	public void display() {
		System.out.println("location is :"+this.location);
		System.out.println("noOfParticipates is:"+noOfParticipates);
		System.out.println("femaleParticipates is :"+this.femaleParticipates );
		System.out.println("endDate is:"+this.endDate);
		
	}
	
	
	
	
	
	
}
