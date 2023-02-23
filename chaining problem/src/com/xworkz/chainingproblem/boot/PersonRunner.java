package com.xworkz.chainingproblem.boot;

import com.xworkz.chainingproblem.thing.Doctor;
import com.xworkz.chainingproblem.thing.Engineer;
import com.xworkz.chainingproblem.thing.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Engineer eng=new Engineer(12, "shruti");
		System.out.println(eng);
		
		System.out.println("--------------------");
		Engineer engg1=new Engineer(12, "shruti", "kavya@gmail");
		System.out.println(engg1);
		
		System.out.println("====================");
		Engineer engg2=new Engineer(12, "shruti", 22, "kavya@gmail");
		System.out.println(engg2);
		
		System.out.println("====================");
		Engineer engg3=new Engineer(12, "shruti", 22, "kavya@gmail");
		System.out.println(engg3);
		
		
		boolean b5=eng.equals(engg1);
		System.out.println(b5);
		
		boolean b6=eng.equals(engg2);
		System.out.println(b6);
		
		boolean b7=engg2.equals(engg3);
		System.out.println(b7);
		
		
		Doctor doc=new Doctor(333, "varunaradhya");
		System.out.println(doc);
		
		System.out.println("==================");
		Doctor doc1=new Doctor(444, "varunaradhya", "pratha@gmail");
		System.out.println(doc1);
		
		System.out.println("===============");
		Doctor doc2=new Doctor(444, "varunaradhya", 55, "pratha@gmail");
		System.out.println(doc2);
		
		System.out.println("================");
		Doctor doc3=new Doctor(103, "varunaradhya", 44, "pratha@gmail", "nuropathy", "Masreddy");
		System.out.println(doc3);
		
		System.out.println("================");
		Doctor doc4=new Doctor(103, "varunaradhya", 44, "pratha@gmail", "nuropathy", "Masreddy");
		System.out.println(doc4);
		
		
		
		boolean boo=doc.equals(doc3);
		System.out.println(boo);
		
		boolean boo1=doc3.equals(doc4);
		System.out.println(boo1);
		
	}

}
