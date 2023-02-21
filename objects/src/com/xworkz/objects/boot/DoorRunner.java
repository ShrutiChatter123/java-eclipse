package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Door;

public class DoorRunner {

	public static void main(String[] args) {

		Door door=new Door();
		door.setWood("teakwood");
		door.setShop("OM SAI Ram");
		door.setColore("Dark wood");
		door.setPrice(4343.33D);
		
		String wood=door.getWood();
		System.out.println(wood);
		String shop=door.getShop();
		System.out.println(shop);
		String colore=door.getColore();
		System.out.println(colore);
		double price=door.getPrice();
		System.out.println(price);
		System.out.println(door.hashCode()+ "OriginalHashCode" +System.identityHashCode(door));
		
		
		System.out.println("=======================");
		
		
		
		
		
		
		Door door1=new Door();
		door1.setWood("pine");
		door1.setShop("Ganesh woods");
		door1.setColore("Creamy yello");
		door1.setPrice(43432.22D);
		
		String wood1=door1.getWood();
		System.out.println(wood1);
		String shop1=door1.getShop();
		System.out.println(shop1);
		String colore1=door1.getColore();
		System.out.println(colore1);
		double price1=door1.getPrice();
		System.out.println(price1);
		System.out.println(door1.hashCode()+ "OriginalHashCode" + System.identityHashCode(door1));
		
		
		boolean B6=door.equals(door1);
		System.out.println(B6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
