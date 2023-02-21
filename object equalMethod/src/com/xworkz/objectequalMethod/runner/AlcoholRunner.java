package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {

		Alcohol alcohol=new Alcohol("Kingfisher", 34, 5454, "kaju");
		System.out.println(alcohol);
		
		System.out.println("======================");
		
		Alcohol alcoho1=new Alcohol("vodka", 11, 2321, "pomo");
		System.out.println(alcoho1);
		
		Alcohol alcoho2=new Alcohol("vodka", 11, 2321, "pomo");
		System.out.println(alcoho2);
		

		boolean bb=alcohol.equals(alcoho1);
		System.out.println(bb);
		
		boolean b3=alcoho1.equals(alcoho2);
		System.out.println(b3);
		
 
		
		
		
		
	}

}