package com.xworkz.chainingproblem.thing;

public class Doctor extends Person {
	private String specialist;
	private String hospitalName;

	public Doctor() {
		System.out.println("No Arg constructor in Doctor");
	}

	public Doctor(int id, String name, int age, String email, String specialist, String hospitalName) {
		super(id, name, age, email);
		this.specialist = specialist;
		this.hospitalName = hospitalName;
		System.out.println("Calling super chaining in Doctor");
	}

	public Doctor(int id, String name, int age, String email) {
		super(id, name, age, email);
		System.out.println("Calling super chaining in doctor");
	}

	public Doctor(int id, String name) {
		super(id, name);
		System.out.println("calling super chaining in doctor");
	}

	public Doctor(int id, String name, String email) {
		super(id, name, email);
		System.out.println("calling super chaining in doctor");

	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nage:" + this.age + "\nid:" + this.id + "\nemail:" + this.email + "\nspecialist:"
				+ this.specialist + "\nhospitalName:" + this.hospitalName;
	}

}
