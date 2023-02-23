package com.xworkz.objectequalMethod.thing;

public class ChiefMinister {

	private String name;
	private double salary;
	private boolean married;
	private String location;
	private String sonName;
	private int ageLimit;
	private String wifeName;
	private String education;
	private String email;
	private long phoneNo;
	private int noOfCildrens;
	private String state;
	private boolean alive;

	public ChiefMinister(String name, double salary, boolean married, String location, String sonName, int ageLimit,
			String wifeName, String education, String email, long phoneNo, int noOfCildrens, String state,
			boolean alive) {
		this.name = name;
		this.salary = salary;
		this.married = married;
		this.location = location;
		this.sonName = sonName;
		this.ageLimit = ageLimit;
		this.wifeName = wifeName;
		this.education = education;
		this.email = email;
		this.phoneNo = phoneNo;
		this.noOfCildrens = noOfCildrens;
		this.state = state;
		this.alive = alive;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in ChiefMinistar" + obj);
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("Obj is ChiefMinistar");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister left = this;
				ChiefMinister right = casted;
				if (left.name.equals(right.name) && left.alive == right.alive && left.married == right.married
						&& left.ageLimit == right.ageLimit && left.education.equals(right.education)
						&& left.email.equals(right.email) && left.location.equals(right.location)
						&& left.noOfCildrens == right.noOfCildrens && left.phoneNo == right.phoneNo
						&& left.salary == right.salary && left.sonName.equals(right.sonName)
						&& left.state.equals(right.state) && left.wifeName.equals(right.wifeName)) {
				} 
				else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not ChiefMinister");
			}
		} else {
			System.err.println("obj is null");
		}
		return true;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nsalary:" + this.salary + "\nmarried:" + this.married + "\neducation:"
				+ this.education + "\nsonName:" + this.sonName + "\nageLimit:" + this.ageLimit + "\nWifeName:"
				+ this.wifeName + "\neducation:" + this.education + "\nemail:" + this.email + "\nphoneNo:"
				+ this.phoneNo + "\nnoOfChildrens:" + this.noOfCildrens + "\nState:" + this.state + "\nalive:"
				+ this.alive;

	}

}
