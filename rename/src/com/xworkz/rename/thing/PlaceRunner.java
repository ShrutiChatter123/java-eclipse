package com.xworkz.rename.thing;

import com.xworkz.rename.boot.Place;

public class PlaceRunner {

	public static void main(String[] args) {
	Place Place=new Place("Bagalkot",554674848,"gadag","karnataka","india");
	Place.display();

	Place Place1=new Place("Bagalkot");
	Place1.display();
	
	Place Place2=new Place(554674848);
	Place2.display();
	
	Place Place3=new Place( 554674848,"gadag");
	Place3.display();
	
	Place Place4=new Place("Karnataka",554674848);
	Place4.display();
	
	Place Place5=new Place("Karnataka","India");
	Place5.display();
			
	
	Place place6=new Place();
	place6.init("bagalkot", 554674848, "gadag", "karnataka","india");
	place6.display();
	
	
	
	
	
	
	}


}
