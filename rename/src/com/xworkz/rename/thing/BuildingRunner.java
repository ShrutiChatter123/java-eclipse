package com.xworkz.rename.thing;

import com.xworkz.rename.boot.Building;

public class BuildingRunner {

	public static void main(String[] args) {
	
	
		
		Building Building=new Building("omkar");
		Building.display();
		
		Building Building1 =new Building( "omkar",4554676,"banglore");
		Building1.display();
				
		Building Building2=new Building("omkar",4554676,"banglore",100000000);	
		Building2.display();
				
		Building Building3=new Building("omkar",455467,"banglore",true);
		Building3.display();
		
		Building Building4=new Building("omkar",4554676,"banglore",100000000,"ramesh");
		Building4.display();
				
		
		
		Building Building5=new Building();
		Building5.init("omkar", 4554676, "banglore", 100000000, true, "ramesh");
		Building.display();
	}

}
