package com.xworkz.kaveri.thing;

public class Hospital {

	String name;
	public Doctor[] doctors;

	public Hospital() {
		System.out.println("no-org constructor Hospital");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setdoctors(Doctor[] doctor) {
		this.doctors = doctor;
	}

	public void display() {
		System.out.println("Detailes of Hospital");
		System.out.println("name: " + name);
		

		if (this.doctors != null) {
			for (int seq = 0; seq < this.doctors.length; seq++) {
				Doctor element = this.doctors[seq];
//				System.out.println("doctors"+""+element+""+"at index"+""+ seq);
				element.display();

			}
		} else {
			System.out.println("this.doctor is not pointing to any memory");
		}

	}

}
