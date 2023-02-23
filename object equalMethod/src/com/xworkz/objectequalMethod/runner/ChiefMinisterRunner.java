package com.xworkz.objectequalMethod.runner;

import com.xworkz.objectequalMethod.thing.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {

		ChiefMinister chiefMinister = new ChiefMinister("yadiyurappa", 33434.76D, true, "Banglore", "Ramvardh", 55,
				"shivani", "B ed", "yadiyurappa@gmail.com", 3244533544L, 5, "karnataka", true);
		System.out.println(chiefMinister);
		System.out.println("-----------------------------");
		ChiefMinister chiefMinister1 = new ChiefMinister("sadanandgowda", 54543, true, "banglore", "ravikumar", 66,
				"vaishnavi", "engineering", "sadagowda@gmail.com", 5546765322446L, 4, "karnataka", true);
		System.out.println(chiefMinister1);

		System.out.println("==========================");

		ChiefMinister chiefMinister2 = new ChiefMinister("sadanandgowda", 54543, true, "banglore", "ravikumar", 66,
				"vaishnavi", "engineering", "sadagowda@gmail.com", 5546765322446L, 4, "karnataka", true);
		System.out.println(chiefMinister2);
		System.out.println("==================================");

		boolean b = chiefMinister.equals(chiefMinister1);
		System.out.println(b);

		boolean b1 = chiefMinister1.equals(chiefMinister2);
		System.out.println(b1);

	}

}
