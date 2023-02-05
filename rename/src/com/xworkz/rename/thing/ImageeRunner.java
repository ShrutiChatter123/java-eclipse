package com.xworkz.rename.thing;

import java.awt.Image;

import com.xworkz.rename.boot.Imagee;

public class ImageeRunner {

	public static void main(String[] args) {
		Imagee Imagee=new Imagee("photography");
		Imagee.display();
		System.out.println("");
		
		Imagee Imagee1=new Imagee(120);
		Imagee1.display();
		System.out.println(" ");
		
		Imagee Imagee2=new Imagee(432 ,"colored");
		Imagee2.display();
		System.out.println(" ");
		
		Imagee Imagee3=new Imagee("photography",4567);
		Imagee3.display();
		System.out.println("");
		
		Imagee Imagee4=new Imagee("colored",32);
		Imagee4.display();
		System.out.println(" ");
		
		Imagee Imagee5= new Imagee(32,"photography",120,"white","bagalkot");
		Imagee5.display();
		System.out.println(" ");
		
		Imagee Imagee6=new Imagee("raj",true);
		Imagee6.display();
		System.out.println(" ");
		
		
			
		}

	}


