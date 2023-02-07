package com.xworkz.kaveri.thing;

public class Gift {

	public double cost;
	public String giftedBy;
	public Box box;

	public Gift() {
		System.out.println("no-org const gift");
		
	}
	public Gift(double cost,String giftedBy) {
		this.cost=cost;
		this.giftedBy=giftedBy;
	}
	
	public void  init(Box box) {
		this.box=box;
	}
	
	public void display() {
		System.out.println("cost:"+this.cost);
		System.out.println("giftedBy:"+this.giftedBy);
		
		if(box!=null) {
			this.box.display();
		}else {
			System.out.println("this box is not pointing to memory");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
