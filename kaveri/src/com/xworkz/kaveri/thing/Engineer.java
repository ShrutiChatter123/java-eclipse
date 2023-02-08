package com.xworkz.kaveri.thing;

public class Engineer {

	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;

	public void Enginner() {
		System.out.println("no-org constructore for engineer");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skill) {
		this.skills = skill;
	}

	public void setDegrees(Degree[] degrees) {
		this.degrees = degrees;
	}

	public void display() {
		System.out.println("Detailes of Engineer");

		if (this.skills != null) {

			for (int seq = 0; seq < this.skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println("skills:" + element + " at index" + seq);
			}

		} else {
			System.out.println("this.skills is not pointing to any memory");
		}

		if (this.degrees != null) {
			for (int seq = 0; seq < this.degrees.length; seq++) {
				Degree element = this.degrees[seq];
				// System.out.println("degrees:"+element+"at index"+seq);
				element.display();
			}
		} else {
			System.out.println("this.skills is not pointing to any memory");
		}

	}

}
