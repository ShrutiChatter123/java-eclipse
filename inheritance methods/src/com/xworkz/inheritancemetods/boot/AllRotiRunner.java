package com.xworkz.inheritancemetods.boot;

import java.io.PrintStream;
import java.util.jar.Attributes.Name;

import com.xworkz.inheritancemethods.thing.ButterRoti;
import com.xworkz.inheritancemethods.thing.JawariRoti;
import com.xworkz.inheritancemethods.thing.Kulcha;
import com.xworkz.inheritancemethods.thing.Naan;
import com.xworkz.inheritancemethods.thing.OnionMasalaRagiRoti;
import com.xworkz.inheritancemethods.thing.OnionRagiRoti;
import com.xworkz.inheritancemethods.thing.RagiRoti;
import com.xworkz.inheritancemethods.thing.Roti;

public class AllRotiRunner {

	public static void main(String[] args) {

	
		OnionMasalaRagiRoti roti1=new OnionMasalaRagiRoti();
		String shape=roti1.getShape();
		System.out.println(shape);
		double calories=roti1.getCalories();
		System.out.println(calories);
		double weight=roti1.getWeight();
		System.out.println(weight);
		double thickness=roti1.getThickNess();
		System.out.println(thickness);
		
		
		
		
		OnionRagiRoti roti2=new OnionMasalaRagiRoti();
		String shape1=roti2.getShape();
		System.out.println(shape1);
		double calories1 = roti2.getCalories();
		System.out.println(calories1);
		double weight1=roti2.getWeight();
		System.out.println(weight1);
		if(roti2 instanceof OnionMasalaRagiRoti) {
		OnionMasalaRagiRoti roti3=(OnionMasalaRagiRoti) roti2;
		double thickness1=roti3.getThickNess();
		System.out.println(thickness1);
		}else {
			System.out.println("roti3 is not pointing to any memory ");
		}
		
		RagiRoti roti3=new OnionMasalaRagiRoti();
		String shape2=roti3.getShape();
		System.out.println(shape);
		double calories2=roti3.getCalories();
		System.out.println(calories2);
		if(roti3 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti4=(OnionMasalaRagiRoti) roti3;
			double thickness2=roti4.getThickNess();
			System.out.println(thickness2);
		}else {
			System.out.println("roti4 is not pointing to any memory");
		}
		if(roti3 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti5=(OnionMasalaRagiRoti) roti2;
			double weight2=roti5.getWeight();
			System.out.println(weight2);
			
		}else {
			System.out.println("roti5 is not pointing to any memory");
		}
		
		Roti roti6=new OnionMasalaRagiRoti();
		String shape3=roti6.getShape();
		System.out.println(shape);
		if(roti6 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti9=(OnionMasalaRagiRoti) roti6;
			double calories3=roti9.getCalories();
			System.out.println(calories3);
		}else {
			System.out.println("roti9 is not pointing to any memory");
		}
		if(roti6 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti7=(OnionMasalaRagiRoti) roti6;
			Double weight3=roti7.getWeight();
			System.out.println(weight3);
		}else {
			System.out.println("roti7 is not pointing to any memory");
		}
		
		if(roti6 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti roti8=(OnionMasalaRagiRoti) roti6;
			double thickness3=roti8.getThickNess();
			System.out.println(thickness3);
		}else {
			System.out.println("roti8 is not pointing to any memory");
		}
		System.out.println("-----------------");
		
		OnionRagiRoti onion=new OnionRagiRoti();
		String shape7=onion.getShape();
		System.out.println(shape);
		double calories7=onion.getCalories();
		System.out.println(calories7);
		double weight7=onion.getWeight();
		System.out.println(weight7);
		
		System.out.println("---------");
		
		
		RagiRoti onion1=new OnionRagiRoti();
		String shape8=onion1.getShape();
		System.out.println(shape1);
		double calories8=onion1.getCalories();
		System.out.println(calories8);
		if(onion1 instanceof OnionRagiRoti) {
			OnionRagiRoti onion2=(OnionRagiRoti) onion1;
			double weight8=onion2.getWeight();
			System.out.println(weight8);
		}else {
			System.err.println("onion2 is not pointing to any memory");
		}
		
		System.out.println("----------------");
		
		Roti onion2=new OnionRagiRoti();
		String shape9=onion2.getShape();
		System.out.println(shape9);
		if(onion2 instanceof OnionRagiRoti) {
			OnionRagiRoti onion3=(OnionRagiRoti) onion2;
			double calories9=onion3.getCalories();
			System.out.println(calories9);
		}else {
			System.out.println("onion3 is not pointing to any memory");
			
		}
		if(onion2 instanceof OnionRagiRoti) {
		OnionRagiRoti onion3=(OnionRagiRoti)onion2;
		double weight8=onion3.getWeight();
		System.out.println(weight8);
		
		}else {
			System.err.println("onion3 is not pointing to any memory");
		}
		
		System.out.println("-----------");
		
		RagiRoti ragi=new RagiRoti();
		String shape10=ragi.getShape();
		System.out.println(shape10);
		double calories10=ragi.getCalories();
		System.out.println(calories10);
		System.out.println("----------------");
		
		
		Roti ragi1=new RagiRoti();
		String shape11=ragi1.getShape();
		System.out.println(shape11);
		if(ragi1 instanceof RagiRoti) {
			RagiRoti ragi2=(RagiRoti)ragi1;
			double calories11=ragi2.getCalories();
			System.out.println(calories11);
		}else {
			System.err.println("ragi2 is not pointing to any memory");
		}
		
		System.out.println("--------------------");
		
		Roti roti = new Roti();
		System.out.println(roti.getShape());
		System.out.println("------------------");
		
		
		
	
		
		
		
		Kulcha kulcha=new Kulcha();
		System.out.println(kulcha.getLength());
		System.out.println(kulcha.getShape());
		System.out.println("           ");
		
		
		Naan kulcha1=new Kulcha();
		System.out.println(kulcha1.getLength());
		System.out.println(kulcha1.getShape());
		System.out.println("      ");
		
		ButterRoti kulcha2=new Kulcha();
		System.out.println(kulcha2.getLength());
		System.out.println(kulcha2.getShape());
		System.out.println("       ");
		
		Roti kulcha4=new Kulcha();
		if(kulcha4 instanceof Kulcha) {
			Kulcha kulcha5=(Kulcha) kulcha4;
			System.out.println(kulcha5.getLength());
		}else {
			System.err.println("kulcha5 is not pointing to kulcha");
		}
		System.out.println(kulcha4.getShape());
		System.out.println("      ");
		
		
		ButterRoti naan1=new Naan();
		System.out.println(naan1.getLength());
		System.out.println(naan1.getShape());
		System.out.println("   ");
		
		Roti naan2=new Naan();
		if(naan2 instanceof Naan) {
			Naan naan3=(Naan) naan2;
			System.out.println( naan3.getLength());
		}else {
			System.out.println("naan3 is not pointing to naan");
		}
		
		System.out.println(naan2.getShape());
		System.out.println("     ");
		
		ButterRoti ButterRoti1=new ButterRoti();
		System.out.println(ButterRoti1.getLength());
		System.out.println(ButterRoti1.getShape());
		System.out.println("       ");
		
		Roti ButterRoti2=new ButterRoti();
		if(ButterRoti2 instanceof ButterRoti) {
			ButterRoti ButterRoti3=(ButterRoti) ButterRoti2;
			System.out.println(ButterRoti3.getLength());
		}else {
			System.out.println("ButterRoti3 is not pointing to any ButterRoti");
		}
		System.out.println(ButterRoti2.getShape());
		System.out.println("     ");
		
		
		JawariRoti JawariRoti=new JawariRoti();
		System.out.println(JawariRoti.getLength());
		System.out.println(JawariRoti.getShape());
		System.out.println(JawariRoti.getprice());
		System.out.println("          ");
		
		ButterRoti JawariRoti1=new JawariRoti();
		System.out.println(JawariRoti1.getLength());
		System.out.println(JawariRoti1.getShape());
		if(JawariRoti1 instanceof JawariRoti) {
			
			JawariRoti jawariRoti2=(JawariRoti) JawariRoti1;
			System.out.println(JawariRoti.getprice());
		}else {
			System.out.println("JawariRoti2 is not pointing to JawariRoti");
		}
			System.out.println("             ");
			
			Roti JawariRoti3=new JawariRoti();
		    if(JawariRoti3 instanceof JawariRoti) {
		    	
		    JawariRoti JawariRoti4=(JawariRoti) JawariRoti3;	
		    System.out.println(JawariRoti4.getLength());
			}else {
				System.out.println("JawariRoti3 is not pointing to any JawariRoti");
			}
		    System.out.println(JawariRoti3.getShape());
		    if(JawariRoti3 instanceof JawariRoti)
		    {
		    	JawariRoti JawariRoti5=(JawariRoti) JawariRoti3;
		    	System.out.println(JawariRoti5.getprice());
		    	
		    }else {
		    	System.out.println("JawariRoti is not pointing to JawariRoti");
		    }
		
		
		
	}
	

}


