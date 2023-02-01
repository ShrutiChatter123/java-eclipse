package com.xworkz.rename.boot;

public class Biryani {

	public String name;
	public int cost;
	public String location;
	public int budget;
	public String matrial;
	public char calories;
	public String manudate;
	public boolean good;
	public double energy;
	public String preparedBy;
	public int weight;
	public String type;
	public String server;
	public long seats;
	public String process;
	
	public Biryani(String arg1) {
		name=arg1;
	}
	public Biryani(int arg2) {
		cost=arg2;
	}
	public Biryani(String arg1,String arg3) {
		name=arg1;
		location=arg3;
	}
	public Biryani(int arg4,String arg5) {
		budget=arg4;
		matrial=arg5;
	
	}
	
	public  Biryani(char arg6) {
		calories=arg6;
	}
	
	public Biryani(String arg7,double arg9) {
		manudate=arg7;
		energy=arg9;
	}
	
	public  Biryani(boolean arg8) {
		good=arg8;
	}
	
	public Biryani(String arg10,int arg11) {
		preparedBy=arg10;
		weight=arg11;
	}
	
	public Biryani( boolean arg8,String arg12) {
		good=arg8;
		type=arg12;
	}
	public Biryani(long arg14,String arg13,String arg15) {
		seats=arg14;
		server=arg13;
		process=arg15;
	}
		
	
	
	 public void display() {
		 
		 System.out.println("name:"+name);
		 System.out.println("cost:"+cost);
		 System.out.println("location:"+location);
		 System.out.println("budget:"+budget);
		 System.out.println("matrial:"+matrial);
		 System.out.println("calories"+calories);
		 System.out.println("manudate:"+manudate);
		 System.out.println("good:"+good);
		 System.out.println("energy:"+energy);
		 System.out.println("preparedBy:"+preparedBy);
		 System.out.println("weight:"+weight);
		 System.out.println("type:"+type);
		 System.out.println("server:"+server);
		 System.out.println("seats:"+seats);
		 System.out.println("process:"+process);
		 
		 
	 }
	
	
	
	
}
