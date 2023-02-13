package com.xworkz.encapsulation.java;

public class Education {

	private String branch;
	private int cost;
	private String educationMinistar;
	
	public Education() {
		System.out.println("information about education");
	}
	
	public void education(String branch, int cost, String educationMinistar) {
		this.branch=branch;
		this.cost=cost;
		this.educationMinistar=educationMinistar;
	}
	
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	
	public void seteducationMinistar(String educationMinistar) {
		this.educationMinistar=educationMinistar;
	}
	
	public String geteducationMinistar() {
		return educationMinistar;
	}
	
	
	public void display() {
		System.out.println("branch name is:"+branch);
		System.out.println("cost is :"+cost);
		System.out.println("educationMinistar is :"+educationMinistar);
	}
	
	
	
	
	
}
