package com.xworkz.technicalprograms.thing;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		System.out.println("enter in string");
		Scanner sp=new Scanner(System.in);
		String tree=sp.next();
		
		char ch[]=tree.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println("original string :"+tree);
		System.out.println("reverse string:"+rev);
		
		if(rev.equals(rev)) {
			System.out.println("its true");
		}else {
			System.out.println("its false");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
