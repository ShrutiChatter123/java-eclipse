package com.xworkz.objectequalMethod.thing;

public class Park {

	private String location;
	private boolean openingTime;
	private int noOfTrees;
	private int noOfVisitars;
	private String maintainer;
	private int workers;
	
	public Park(String location,boolean openingTime,int noOfTreess,int niOfVisitars,String maintainer, int workers){
		
		this.location=location;
		this.openingTime=openingTime;
		this.noOfTrees=noOfTreess;
		this.noOfVisitars=niOfVisitars;
		this.maintainer=maintainer;
		this.workers=workers;
		
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println("Obj is running in park"+obj);
	if(obj!=null) {
		System.out.println("Obj is not null");
		if(obj instanceof Park) {
			System.out.println("Obj is Park");
			Park casting=(Park)obj;
			Park left=this;
			Park right=casting;
			if(left.location.equals(right.location)&& left.openingTime==right.openingTime && left.noOfTrees==right.noOfTrees && left.noOfVisitars==right.noOfVisitars&& left.maintainer==right.maintainer) {
				System.out.println("left is equal to right");
				return true;
			}else {
				System.out.println("left right are not same");
			}
		}else {
			System.out.println("Org is not a Park");
		}
	}else {
		System.out.println("obj is null");
	}
		return super.equals(obj);
	}
	
	
	@Override
	public String toString() {
		return "location:"+this.location +
				"\nopeningTime:"+this.openingTime + 
				"\nNoOfTrees:"+this.noOfTrees 
				+"\nNoOfVisitars:"+this.noOfVisitars
				+"\nmaintainer:"+this.maintainer + "\nWorkers:"+this.workers;
	}
	
	
	
	
	
	
	
	
	
}
