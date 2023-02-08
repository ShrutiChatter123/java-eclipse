package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Degree;
import com.xworkz.kaveri.thing.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();

		engineer.setName("Abhishek");
		engineer.setSalary(45000.0);

		String[] ref = { "java", "python", "c++" };
		engineer.setSkills(ref);

		Degree degree1 = new Degree();
		degree1.setname("BE", 4, true, 7.9, "civil");

		Degree[] ref2 = { degree1 };
		engineer.setDegrees(ref2);
		engineer.display();

	}
}