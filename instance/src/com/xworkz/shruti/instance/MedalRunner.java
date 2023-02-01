package com.xworkz.shruti.instance;

public class MedalRunner {

	public static void main(String[] args) {
		Medal Medal= new Medal();
		Medal.display();
		
		Medal.name ="For achivement";
		Medal.sports="Hockey";
		Medal.price=54444;
		Medal.type="gold";
		Medal.colore="white";
		Medal.weight=700.77d;
		Medal.isMedal=true;
		Medal.ranks=5;
		Medal.rank1="bronge";
		Medal.size=75;
		Medal.founded=1776;
		Medal.founder="otmalji goraji";
		Medal.isCoated=false;
		Medal.totalMedals=5;
		
		Medal.display();
		

	}

}
