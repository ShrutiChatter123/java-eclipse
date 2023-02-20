package com.xworkz.technicalprograms.thing;

import java.util.Scanner;

public class StringPalindram {

	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner sp=new Scanner(System.in);
		String name=sp.next();
		
		char ch[]=name.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println("original string:"+name);
		System.out.println("reversed string:"+rev);
		
		if(name.equals(rev)) {
			System.out.println("its true");
		}else {
			System.out.println("its false");
		}
		
	}
	
	
	
	
	
	
	
}





