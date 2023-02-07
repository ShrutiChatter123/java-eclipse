package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Box;
import com.xworkz.kaveri.thing.Gift;

public class GiftRunner {

	public static void main(String[] args) {
		Gift gift=new Gift(5777,"raj");
		gift.display();
		Box box=new Box("round",4444,"near hospet");
		box.display();

	}

}
