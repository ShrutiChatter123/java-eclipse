package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Sweater;
import com.xworkz.kaveri.thing.Zip;

public class SweaterRunner {

	public static void main(String[] args) {
		Sweater sweater=new Sweater("ramraj",550);
		sweater.display();
		Zip zip=new Zip("blue",1000D);
		zip.display();

	}

}

