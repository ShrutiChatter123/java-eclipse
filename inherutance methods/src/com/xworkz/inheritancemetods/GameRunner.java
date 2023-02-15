package com.xworkz.inheritancemetods;

import com.xworkz.inheritancemethods.thing.CandyCrush;
import com.xworkz.inheritancemethods.thing.Game;

public class GameRunner {

	public static void main(String[] args) {

	CandyCrush crush=new CandyCrush();
	crush.enterTainment();
	String developer=crush.getDeveloper();
	crush.getDeveloper();
		
	Game game=new Game("Riccardo Zacconi");
	String developer1=game.getDeveloper();
	System.out.println(developer1);
		
	Game game1=new CandyCrush();
	String developer2=game1.getDeveloper();
	System.out.println(developer2);
	
	CandyCrush candyCrush=(CandyCrush) game1;
	candyCrush.enterTainment();
		
		
		
		
		
		
		
	}

}
