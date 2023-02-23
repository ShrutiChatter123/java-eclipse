package com.xworkz.chainingproblem.thing;

public class Engineer extends Person {

	public Engineer() {
		System.out.println("No Arg constructor in Engineer");
	}
	
	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);
		System.out.println("Calling super chaining in Engineer");
	}

	public Engineer(int id, String name){
		super(id ,name);
		System.out.println("");
	}
		
	public Engineer(int id, String name, String email) {
		super(id,name,email);
		System.out.println();
	
	}
	
	
	@Override
	public String toString() {

		return "id:" + this.id + "\nname:" + this.name + "\nage:" + this.age + "\nemail:" + this.email;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running obj in person");
		if(obj!=null) {
			System.out.println("obj is not null");
			if(obj instanceof Person) {
				System.out.println("obj is person");
				Engineer casted=(Engineer)obj;
				Engineer left=this;
				Engineer right=casted;
				if(left.id==right.id && left.name==right.name&& left.age==right.age && left.email==right.email) {
					System.out.println("left is equal to right");
					return true;
				}else {
					System.out.println("left is not equal to right");
				}
			}else {
				System.err.println("obj is not person");
			}
		}else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {

		return 4343;
	}
}
