package com.xworkz.kaveri.thing;

public class Cards {

	public String bankCard;
	public String colore;
	public double cost;

	

	public Cards(String bankCard, String colore, double cost) {
		this.bankCard = bankCard;
		this.colore = colore;
		this.cost = cost;
	}

	public void display() {
		System.out.println("bankCard:"+this.bankCard);
		System.out.println("colore:"+this.colore);
		System.out.println("cost:"+this.cost);
	
	}

}
