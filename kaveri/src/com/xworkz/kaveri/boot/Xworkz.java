package com.xworkz.kaveri.boot;

public class Xworkz {

	public String location;
	public int students;
	public int chair;
	public Trainer Trainer =new Trainer();
	
	public void init(String location,int students,int chair) {
		this.location=location;
		this.students=students;
		this.chair=chair;
	
	}
	
	public void display() {
		System.out.println("location:"+location);
		System.out.println("students:"+students);
		System.out.println("chair:"+chair);
		this.Trainer.display();
	}
	
}
