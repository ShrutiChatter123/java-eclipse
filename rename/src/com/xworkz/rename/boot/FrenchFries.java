package com.xworkz.rename.boot;

public class FrenchFries {

	public String place;
	public int cost;
	public char calories;
	public int length;
	public int weight;
	public String founder;
	public int year;
	public String manudate;
	public double energy;
	public boolean good;
	
	
	public  FrenchFries(String arg1) {
		place=arg1;
	}
	
	public FrenchFries(int arg2) {
		cost=arg2;
	}
	public FrenchFries(char arg3){
		calories=arg3;
	}
	
	public FrenchFries(boolean arg4) {
		good=arg4;
	}
	
	public FrenchFries(String arg1, int arg2) {
		place=arg1;
		cost=arg2;
	}
	
	public FrenchFries(int arg2, int arg5) {
		cost=arg2;
		length=arg5;
	}
	public FrenchFries(boolean arg6,String arg1) {
		good= arg6;
		place=arg1;
	}

	public FrenchFries(String arg1,char arg3) {
		place=arg1;
		calories= arg3;
	}
	
	public FrenchFries(String arg1,String arg7) {
		place=arg1;
		founder=arg7;
	}
	public FrenchFries(String arg1, double arg8) {
		place=arg1;
		energy=arg8;
	}
	
	public void display() {
		
		
		System.out.println("place is:" +place);
		System.out.println("cost is :"+cost);
		System.out.println("caloroies is:"+calories);
		System.out.println("lengthis:"+length);
		System.out.println("weight is:"+weight);
		System.out.println("founder is :"+founder);
		System.out.println("year is :"+ year);
		System.out.println("manudate is:"+ manudate);
		System.out.println("energy is :"+energy);
		System.out.println("good is:"+ good);
		
		
		
		
		
		
	}
	
	
	
}
