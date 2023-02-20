package com.xworkz.objects.boot;

import com.xworkz.objects.thing.SugarCane;

public class SugarCaneRunner {

	public static void main(String[] args) {

		SugarCane cane=new SugarCane();
		cane.setName("Nirani");
		cane.setBudget(54455.44D);
		cane.setOwner("shree Nirani");
		cane.setLocation("Bagalkot");
		
		String name=cane.getName();
		System.out.println(name);
		double budget=cane.getBudget();
		System.out.println(budget);
		String owner=cane.getOwner();
		System.out.println(owner);
		String location=cane.getLocation();
		System.out.println(location);
		System.out.println(cane.hashCode()+ "OriginalHashCode"+System.identityHashCode(cane));
		
		System.out.println("==================");
		
		SugarCane cane1=new SugarCane();
		cane1.setName("Ramrang");
		cane1.setBudget(5454454.55D);
		cane1.setOwner("Shreemutthi");
		cane1.setLocation("Bijapur");
		
		String name1=cane1.getName();
		System.out.println(name1);
		double budget1=cane1.getBudget();
		System.out.println(budget1);
		String owner1=cane1.getOwner();
		System.out.println(owner1);
		String location1=cane1.getLocation();
		System.out.println(location1);
		System.out.println(cane1.hashCode()+ "OriginalHashCode" + System.identityHashCode(cane1));
		
		boolean B7=cane.equals(cane1);
		System.out.println(B7);
		
		
		
		
		
		
		
		
		
		
	}

}
