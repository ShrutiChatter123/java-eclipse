package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {

		Cake cake=new Cake("Pista", 20, "Square", 44);
		System.out.println(cake);
		
		Cake cake1=new Cake("Straberry", 41, "round", 50);
		System.out.println(cake1);
		
		Cake cake2=new Cake("Straberry", 41, "round", 50);
		System.out.println(cake2);
		
		
		boolean ref=cake.equals(cake1);
		System.out.println(ref);
				
		boolean ref1=cake1.equals(cake2);
		System.out.println(ref1);
		
		
		
	}

}
