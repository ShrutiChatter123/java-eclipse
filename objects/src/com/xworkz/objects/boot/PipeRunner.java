package com.xworkz.objects.boot;

import com.xworkz.objects.thing.Pipe;

public class PipeRunner {

	public static void main(String[] args) {

		Pipe pipe=new Pipe();
		pipe.setName("Finolex");
		pipe.setCost(3320);
		pipe.setShop("Bagalkot");
		pipe.setBudget(54321.66D);
		
		String name=pipe.getName();
		System.out.println(name);
		int cost=pipe.getCost();
		System.out.println(cost);
		String shop=pipe.getShop();
		System.out.println(shop);
		double budget=pipe.getBudget();
		System.out.println(budget);
		System.out.println(pipe.hashCode() + "OriginalHashCode"+System.identityHashCode(pipe));
	
		System.out.println("=====================");
		
		Pipe pipe1=new Pipe();
		pipe1.setName("PVC");
		pipe1.setCost(2435);
		pipe1.setShop("Navanagar");
		pipe1.setBudget(65430.43D);
		
		String name1=pipe1.getName();
		System.out.println(name1);
		int cost1=pipe1.getCost();
		System.out.println(cost1);
		String shop1= pipe1.getShop();
		System.out.println(shop1);
		double budget1=pipe1.getBudget();
		System.out.println(budget1);
		System.out.println(pipe1.hashCode()+ "OriginalHashCode"+ System.identityHashCode(pipe1));
		
		
		boolean B4=pipe.equals(pipe1);
		System.out.println(B4);
		
		
		
	}

}
