package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Gold;

public class GoldRunner {

	public static void main(String[] args) {

	Gold gold=new Gold();
	gold.setShop("GK gold");
	gold.setLocation("Banglore");
	gold.setPrice(32323.65D);
	gold.isQuality(true);
	
	String shop=gold.getShop();
	System.out.println(shop);
	String location=gold.getLocation();
	System.out.println(location);
	double price=gold.getPrice();
	System.out.println(price);
	boolean quality= gold.isquality();
	System.out.println(quality);
	System.out.println(gold.hashCode()+ "OriginalHashCode"+System.identityHashCode(gold));
	
	System.out.println("-------------------------");
	
	
	
	
	Gold gold1=new Gold();
	gold1.setShop("Shilvantha group");
	gold1.setLocation("Banglore nagar");
	gold1.setPrice(32321.43D);
	gold1.isQuality(true);
	
	String shop1=gold1.getShop();
	System.out.println(shop1);
	String location1=gold1.getLocation();
	System.out.println(location1);
	double price1=gold1.getPrice();
	System.out.println(price1);
	boolean quality1=gold1.isquality();
	System.out.println(quality1);
	System.out.println(gold1.hashCode()+ "OriginalHashCode" + System.identityHashCode(gold1));
		
	
	boolean B5= gold.equals(gold1);
	System.out.println(B5);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
