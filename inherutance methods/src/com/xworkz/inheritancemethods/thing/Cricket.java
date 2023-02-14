package com.xworkz.inheritancemethods.thing;

public class Cricket extends Sports {

	public Cricket() {
		System.out.println("no-org constructor");
	}

	public Cricket(String skills) {
		super(skills);
	}

	public void improvesAttention() {
		System.out.println("running improve Attention in cricket");
	}

}
