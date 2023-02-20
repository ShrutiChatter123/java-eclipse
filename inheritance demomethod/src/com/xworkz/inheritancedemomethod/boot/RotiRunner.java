package com.xworkz.inheritancedemomethod.boot;

import com.xworkz.inheritancedemomethod.thing.ButterRoti;
import com.xworkz.inheritancedemomethod.thing.JowarRoti;
import com.xworkz.inheritancedemomethod.thing.Kulcha;
import com.xworkz.inheritancedemomethod.thing.Naan;
import com.xworkz.inheritancedemomethod.thing.OnionMasalaRagiRoti;
import com.xworkz.inheritancedemomethod.thing.OnionRagiRoti;
import com.xworkz.inheritancedemomethod.thing.RagiRoti;
import com.xworkz.inheritancedemomethod.thing.Roti;

public class RotiRunner {

	public static void main(String[] args) {

		
	Roti roti=new Roti();
	 String shape=roti.getShape();;
	  System.out.println(shape);
	  
	 RagiRoti ragiroti=new RagiRoti();
	 int calorirs=ragiroti.getCalories();
	  System.out.println(4320);
	 
	 Roti roti1=new RagiRoti();
	  String shape1=roti.getShape(); 
	  System.out.println(shape1);
		RagiRoti ragi=(RagiRoti)roti1;
       int calories =ragi.getCalories();
       System.out.println(calories);
       
       
       OnionRagiRoti onion=new OnionRagiRoti();
       int weight=onion.getWeight();
       System.out.println(22);
		
		RagiRoti onion1=new OnionRagiRoti();
		String shape2=onion1.getShape();
		System.out.println(weight);
		int calories1=onion1.getCalories();
		System.out.println(calories1);
		OnionRagiRoti casting= (OnionRagiRoti) onion1;
		int weight1=onion1.getCalories();
		System.out.println(weight1);
		
		Roti roti2=new OnionRagiRoti();
		String shape3=roti2.getShape();
		System.out.println(shape3);
		RagiRoti casting1=(RagiRoti)roti2;
		int calories2=casting1.getCalories();
		System.out.println(calories2);
		OnionRagiRoti casting3=(OnionRagiRoti) roti2;
		int weight2=casting3.getWeight();
		
		
		OnionMasalaRagiRoti masala=new OnionMasalaRagiRoti();
		int thickness=masala.getThickNess();
		System.out.println(thickness);
		int weight3=masala.getWeight();
		System.out.println(weight3);
		int calories3=masala.getCalories();
		System.out.println(calories3);
		String shape4=masala.getShape();
		System.out.println(shape4);
		
		OnionRagiRoti masala1=new OnionMasalaRagiRoti();
		int weight4=masala1.getWeight();
		System.out.println(weight4);
		int calories4=masala1.getCalories();
		System.out.println(calories4);
		String shape5=masala1.getShape();
		System.out.println(shape5);
		OnionMasalaRagiRoti casting2=(OnionMasalaRagiRoti)masala1;
		int thickness1=casting2.getThickNess();
		System.out.println(thickness1);
		
		RagiRoti raragi=new OnionMasalaRagiRoti();
		int calories5=raragi.getCalories();
		System.out.println(calories5);
		String shape6=raragi.getShape();
		System.out.println(shape6);
		OnionRagiRoti casted=(OnionRagiRoti) raragi;
		int weight5=casted.getWeight();
		System.out.println(weight5);
		OnionMasalaRagiRoti casted1=(OnionMasalaRagiRoti)raragi;
		int thickNess=casted1.getThickNess();
		System.out.println(thickNess);
		
		Roti roti11=new OnionMasalaRagiRoti();
		String shape7=roti11.getShape();
		System.out.println(shape7);
		RagiRoti castingg=(RagiRoti)roti11;
		int calories6=castingg.getCalories();
		System.out.println(calories6);
		OnionRagiRoti castinggg=(OnionRagiRoti)roti11;
		int weight6=castinggg.getWeight();
		System.out.println(weight6);
		OnionMasalaRagiRoti castingggg=(OnionMasalaRagiRoti)roti11;
		int thickNess1=castingggg.getThickNess();
		System.out.println(thickNess1);
		
		
		
		System.out.println("=============================");
		
		Kulcha kul=new Kulcha();
		 boolean taste=kul.getTaste();
		 System.out.println(taste);
		 int cost=kul.getCost();
		 System.out.println(cost);
		 int length=kul.getLength();
		 System.out.println(length);
		 String shape8=kul.getShape();
		 System.out.println(shape8);
		 
		 Naan nan=new Kulcha();
		 int cost1=nan.getCost();
		 System.out.println(cost1);
		 int length1=nan.getLength();
		 System.out.println(length1);
		 String shape9=nan.getShape();
		 System.out.println(shape9);
		 Kulcha cast=(Kulcha)nan;
		 boolean taste1=cast.getTaste();
		 System.out.println(taste1);
		 
		 ButterRoti bul=new Kulcha();
		 int length2=bul.getLength();
		 System.out.println(length2);
		 String shape10=bul.getShape();
		 System.out.println(shape10);
		 Naan castiii=(Naan)bul;
		 int cost11=castiii.getCost();
		 System.out.println(cost11);
		 
		 
		 
		 
		
		
		
		
		
	}

}
