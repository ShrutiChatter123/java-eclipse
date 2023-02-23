package com.xworkz.inheritancemethods.thing;

public class Game {

	private String developer;
	
	public Game() {
		System.out.println("no-org constructor");
	}
	
	
	public Game(String developer)
	{
		this.developer=developer;
		System.out.println("String in Game");
		System.out.println(this.developer);
	}
	
	public String  getDeveloper() {
		return developer;
	}
	
	
	
	
	
	
	
}
