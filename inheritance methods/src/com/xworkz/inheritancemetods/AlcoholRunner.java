package com.xworkz.inheritancemetods;

import com.xworkz.inheritancemethods.thing.Alcohol;
import com.xworkz.inheritancemethods.thing.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {

		Whiskey wiskey = new Whiskey();
		wiskey.energyDrink();
		String brand = wiskey.getBrand();
		wiskey.getBrand();

		Alcohol alcohol = new Alcohol("Chivas Regal");
		alcohol.getBrand();
		String brand1 = alcohol.getBrand();
		System.out.println(brand1);
		
		Alcohol alcoho1=new Whiskey();
		String brand2=alcoho1.getBrand();
		System.out.println(brand2);
		
		Whiskey wiskey1=(Whiskey) alcoho1;
		wiskey1.energyDrink();
		
		
		

	}

}
