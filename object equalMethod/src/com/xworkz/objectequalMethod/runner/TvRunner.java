package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.Tv;

public class TvRunner {

	public static void main(String[] args) {

		Tv tv= new Tv("LED", 43543.44D, 234);
		System.out.println(tv);
		
		Tv tv1=new Tv("Sony", 342.98D, 213);
		System.out.println(tv1);
		
		Tv tv2=new Tv("Sony", 342.98D,213 );
		System.out.println(tv2);
		
		boolean b11=tv.equals(tv1);
		System.out.println(b11);
		
		boolean b12=tv2.equals(tv1);
		System.out.println(b12);
		
		
		System.out.println(tv.hashCode()+"Original:"+System.identityHashCode(tv2));
		
	
	}
	
	
}
