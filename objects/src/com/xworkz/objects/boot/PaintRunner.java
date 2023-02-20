package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setBrand("Asian paint");
		paint.setCost(4343);
		paint.setShop("RajajiNagar");
		paint.setOwner("AdilKhan");

		String brand = paint.getBrand();
		System.out.println(brand);
		int cost = paint.getCost();
		System.out.println(cost);
		String shop = paint.getShop();
		System.out.println(shop);
		String owner = paint.getowner();
		System.out.println(owner);

		System.out.println(paint.hashCode() + "origginal " + System.identityHashCode(paint));

		
		System.out.println("-------------------------------");
		
		
		Paint paint1 = new Paint();
		paint1.setBrand("NipponPaint");
		paint1.setCost(3444);
		paint1.setShop("Navanagar");
		paint1.setOwner("ramesh");

		String brand1 = paint1.getBrand();
		System.out.println(brand1);
		int cost1 = paint1.getCost();
		System.out.println(cost1);
		String shop1 = paint1.getShop();
		System.out.println(shop1);
		String owner1 = paint1.getowner();
		System.out.println(owner1);

		System.out.println(paint.hashCode() + "original " + System.identityHashCode(paint1));

		boolean b1 = paint.equals(paint1);
		System.out.println(b1);

	}

}
