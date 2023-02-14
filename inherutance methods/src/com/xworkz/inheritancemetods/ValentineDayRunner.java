package com.xworkz.inheritancemetods;

import com.xworkz.inheritancemethods.thing.Feb14;
import com.xworkz.inheritancemethods.thing.ValentineDay;

public class ValentineDayRunner {

	public static void main(String[] args) {

	Feb14 feb14=new Feb14();
	feb14.celebrationDay();
	boolean loversDay=feb14.getLoversDay();
	feb14.getLoversDay();
	
	ValentineDay valentineDay=new ValentineDay(true);
	boolean loversDay1=valentineDay.getLoversDay();
	System.out.println(loversDay1);
	
	ValentineDay valentineDay1=new Feb14();
	boolean loversDay2=valentineDay.getLoversDay();
	System.out.println(loversDay2);
	
	Feb14 feb141 = (Feb14) valentineDay;
	feb141.celebrationDay();
	
		
		
		
		
		
		
		
		
	}

}
