package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Adike;

public class AdikeRunner {

	public static void main(String[] args) {

		Adike adike=new Adike();
		adike.setColore("Dark red");
		adike.setCost(44);
		adike.setValidity(true);
		adike.setManufacturedBy("Rajvardh group");
		
		String colore=adike.getColore();
		System.out.println(colore);
		int cost=adike.getCost();
		System.out.println(cost);
		boolean validity=adike.isValidity();
		System.out.println(validity);
		String manufacturedBy=adike.getManufacturedBy();
		System.out.println(manufacturedBy);
		System.out.println(adike.hashCode()+ "OriginalHashCode"+System.identityHashCode(adike));
		
	System.out.println("--------------------");	
		
		Adike adike1=new Adike();
		adike1.setColore("light red");
		adike1.setCost(33);
		adike1.setValidity(true);
		adike1.setManufacturedBy("Gowda group");
		
		String colore1=adike1.getColore();
		System.out.println(colore1);
		int cost1=adike1.getCost();
		System.out.println(cost1);
		boolean validity1=adike1.isValidity();
		System.out.println(validity1);
		String manufacturedBy1=adike1.getManufacturedBy();
		System.out.println(manufacturedBy1);
		System.out.println(adike.hashCode()+ "OriginalHashCode" +System.identityHashCode(adike1));
		
		
		
		boolean b3= adike.equals(adike1);
		System.out.println(b3);
		
		
		
		
		
		
		
		
		
	}

}
