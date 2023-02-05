package com.xworkz.rename.boot;

public class Serial {

	public String name;
	public String location;
	public int budget;
	public String hero;
	public String director;
	public boolean end;
	public int date;
	public long seats;
	public int timing;
	public int noOfSong; 

	
	public Serial()
	{
		System.out.println("starting with serial");
	}
	
	public Serial(String name,String location,int budget) {
		this.name=name;
		this.location=location;
		this.budget=budget;
		
	}
	public Serial(String name,String location, int budget,String director,boolean end) {
		this(name,location,budget);
		this.director=director;
		this.end=end;
	}
	public Serial(String name,String location, int budget,String director,boolean end,int date) {
		this(name,location,budget,director,end);
		this.date=date;
	}
	
	public Serial(String name,String location,String hero,int date,long seats,int noOfSong) {
		this(name,location,date);
		this.seats=seats;
		this.noOfSong=noOfSong;
		this.hero=hero;
	
	}
	public Serial( String name,String location,String hero, int date,long seats,int timing,int noOfSong) {
		this(name,location,hero,date,seats,noOfSong);
		this.timing=timing;
	
	}
	
	public void init(String name,String location,int budget,String hero,String director,boolean end,int date,long seats,int timing,int noOfSong) {
		this.name=name;
		this.location=location;
		this.budget=budget;
		this.hero=hero;
		this.director=director;
		this.end=end;
		this.date=date;
		this.seats=seats;
		this.timing=timing;
		this.noOfSong=noOfSong;
			
	}
	
	
	
	
	
	
	
	public void display() {
		System.out.println("display data");
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("budget:"+budget);
		System.out.println("hero:"+hero);
		System.out.println("director:"+director);
		System.out.println("end:"+end);
		System.out.println("date:"+date);
		System.out.println("seats:"+seats);
		System.out.println("timing:"+timing);
		System.out.println("noOfSong:"+noOfSong);
		
		
		
		
	}
	
}
