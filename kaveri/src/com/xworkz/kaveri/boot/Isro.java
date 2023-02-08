package com.xworkz.kaveri.boot;

public class Isro {

	public String[] locations;
	public int[] satteliteNos;
	public Scientist[] scientists;

	public Isro() {
		System.out.println("no-arg constructor isro");
	}

	public void setlocation(String[] location) {
		this.locations = location;
	}

	public void setsatteliteNo(int[] satteliteNos) {
		this.satteliteNos = satteliteNos;
	}

	public void setScientists(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void display() {
		System.out.println("detailes of isro");

		if (this.locations != null) {
			for (int seq = 0; seq < this.locations.length; seq++) {
				String element = this.locations[seq];
				System.out.println("location:" + element + "at index" + seq);

			}
		} else {
			System.out.println("this.location not pointing to any memory..");

		}
		if (this.satteliteNos != null) {
			for (int seq = 0; seq < this.satteliteNos.length; seq++) {
				int element = this.satteliteNos[seq];
				System.out.println("satteliteNos:" + element + "at index" + seq);
			}
		} else {
			System.out.println("this.satteliteNos is not pointing memory..");
		}

		if (this.scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientist element = this.scientists[seq];
				element.display();
			}
		} else {
			System.out.println("this.scientists is not pointing to  any memory");
		}

	}

}
