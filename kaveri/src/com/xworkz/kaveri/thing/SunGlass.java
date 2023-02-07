package com.xworkz.kaveri.thing;

public class SunGlass {

	public String frame;
	public int cost;
	public Glass glass;
	
	
	public SunGlass() {
		System.out.println("no-org construction Sunglass");
	}
	
	public SunGlass(String frame,int cost) {
		this.frame=frame;
		this.cost=cost;
	}
	public void init(Glass glass) {
		this.glass=glass;
	}
	
	public void display() {
		System.out.println("frame:"+this.frame);
		System.out.println("cost:"+this.cost);
		
		if(glass!=null) {
			this.glass.display();
		}else {
			System.err.println("this glass is not pointing to memory");
		}
		
	}
	
	
	
}
