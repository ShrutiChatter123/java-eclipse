package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Sun;
import com.xworkz.kaveri.thing.Sunrise;

public class SunriseRunner {

	public static void main(String[] args) {
		Sunrise sunrise=new Sunrise(6,"white","east");
		sunrise.display();
		Sun sun=new Sun("ravi","proton",false);
		sun.display();

	}

}
