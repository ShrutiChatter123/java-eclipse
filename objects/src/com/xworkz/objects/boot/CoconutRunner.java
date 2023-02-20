package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {

		Coconut coco=new Coconut();
		coco.setShop("RamNagar");
		coco.setCost(6666);
		coco.setColore("brown");
		coco.setShape("round");
		
		String shop=coco.getShop();
		System.out.println(shop);
		int cost=coco.getCost();
		System.out.println(cost);
		String colore=coco.getColore();
		System.out.println(colore);
		String shape=coco.getShape();
		System.out.println(shape);
		
		System.out.println(coco.hashCode()+ "OriginalHashCode"+ System.identityHashCode(coco));
		
		
		
		
		
		
		
		System.out.println("..........................");
		
		Coconut coco1=new Coconut();
		coco1.setShop("rajajiNagar");
		coco1.setCost(4433);
		coco1.setColore("Dark Brown");
		coco1.setShape("parabola");
		
		String shop1=coco1.getShop();
		System.out.println(shop1);
		int cost1=coco1.getCost();
		System.out.println(cost1);
		String colore1=coco1.getColore();
		System.out.println(colore1);
		String shape1=coco1.getShape();
		System.out.println(shape1);
		System.out.println(coco1.hashCode()+"OriginalHashCode"+ System.identityHashCode(coco1));
		
	
		
		boolean b2=coco.equals(coco1);
		System.out.println(b2);
		
		
		
		
		
	}

}
