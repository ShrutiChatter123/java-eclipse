package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Doctor;
import com.xworkz.kaveri.thing.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.setName("Kumareshwar");
		hospital.display();

		Doctor doctor = new Doctor();
		doctor.setName("Kims");

		String[] ref = { "mbbs", "md" };

		doctor.setSpecilizations(ref);

		doctor.setExperience(22.0);

		doctor.display();

	}

}
