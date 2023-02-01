package com.xworkz.shruti.instance;

public class FlightRunner {

	public static void main(String[] args) {
		Flight ref=new Flight();
		
		ref.name="Airbus";
		ref.cost=67999;
		ref.seats=20;
		ref.domestic= true;
		ref.seatType= "window seat";
		ref.classType= "Business class";
		ref.length=57;
		ref.height=7;
		ref.width=7;
		ref.speed=5555;
		
		ref.display();
		
		ref.name="Indigo";
		ref.cost=45432;
		ref.seats= 34;
		ref.domestic= false;
		ref.seatType="middle seat";
		ref.classType="first class";
		ref.length=65;
		ref.height=5;
		ref.width=8;
		ref.speed=500;
		

	}

}
