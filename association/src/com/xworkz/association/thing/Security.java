package com.xworkz.association.thing;

public class Security {

	public String deptName;
	public int totalStaff;
	public int headStaff;
	public Company company;
	
	public Security() {
		System.out.println("No-org constructor to Security");
	}
	
	public void setsecurity(String deptName,int totalStaff,int headStaff) {
		this.deptName=deptName;
		this.totalStaff=totalStaff;
		this.headStaff=headStaff;
	}
	public void setcompany(Company company) {
		this.company=company;
	}
	
	public void display() {
		System.out.println("security deptName is:"+this.deptName);
		System.out.println("security totalStaff no is:"+this.totalStaff);
		System.out.println("security headStaff no is:"+this.headStaff);
		
		if(this.company!=null) {
			this.company.display();
		}else {
			System.out.println("this.company is not pointing to any memory");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
