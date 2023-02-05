package com.xworkz.rename.thing;

import com.xworkz.rename.boot.Serial;

public class SerialRunner {

	public static void main(String[] args) {
	
		Serial Serial=new Serial("nagin","banglore",656654);
		Serial.display();
		
		Serial Serial1=new Serial("nagin","banglore",656654,"ramraj",true);
		Serial1.display();
		
		Serial Seria2=new Serial("nagin","banglore",656654,"ramraj",true,20);
		Serial.display();
		
		Serial Seria3=new Serial("nagin","banglore","yash",20,321,5);
		Serial.display();
		
		Serial Serial4=new Serial("nagin","banglore","yash",20,321,12,5);
		Serial4.display();
		

		Serial Serial5=new Serial();
		Serial5.init("nagin", "banglore", 656654, "yash", "ramraj", true, 20, 321, 12, 5);
		
		
		
	}

}
