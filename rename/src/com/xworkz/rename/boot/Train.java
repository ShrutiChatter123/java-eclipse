package com.xworkz.rename.boot;

public class Train {

	public String name;
	public int cost;
	public String from;
	public double timing;
	public String to;
	
	
	public Train(String arg1) {
		name=arg1;
	}
	public Train(int arg2) {
		cost=arg2;
	}
	public Train(String arg1,String  arg3) {
		name=arg1;
		from=arg3;
	}
	public Train(double arg4,String arg5) {
		timing=arg4;
		to=arg5;
	}
	
	
	
	public void display() {
		System.out.println("name:"+ name);
		System.out.println("cost:"+cost);
		System.out.println("from:"+from);
		System.out.println("timing:"+timing);
		System.out.println("to:"+to);
	
	}
	
	
	
}
