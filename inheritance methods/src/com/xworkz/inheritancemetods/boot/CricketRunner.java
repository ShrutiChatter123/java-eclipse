package com.xworkz.inheritancemetods.boot;

import com.xworkz.inheritancemethods.thing.Cricket;
import com.xworkz.inheritancemethods.thing.Sports;

public class CricketRunner {

	public static void main(String[] args) {

	
		Cricket cricket=new Cricket();
		cricket.improvesAttention();
		String skills=cricket.getSkills();
		cricket.getSkills();
		System.out.println(skills);
		
		Sports sports=new Sports("jumping");
		String skills1=sports.getSkills();
		System.out.println(skills1);
		
		Sports sports1=new Cricket();
		String skills2=cricket.getSkills();
		System.out.println(skills2);
		
		
		Cricket cricket1= (Cricket) sports1;
		cricket1.improvesAttention();
		
	
		
		
		
		
		
		
		
		
		
	}

}
