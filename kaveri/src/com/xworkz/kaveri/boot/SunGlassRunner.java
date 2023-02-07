package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Glass;
import com.xworkz.kaveri.thing.SunGlass;

public class SunGlassRunner {

	public static void main(String[] args) {
		SunGlass sunglass=new SunGlass("square",4544);
		sunglass.display();
		Glass glass=new Glass("ray-ban","pair");
		glass .display();

	}

}
