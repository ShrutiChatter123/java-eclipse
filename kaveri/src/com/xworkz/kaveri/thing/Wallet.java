package com.xworkz.kaveri.thing;

public class Wallet {

	public String colore;
	public double cost;
	public String shop;
	public Cards cards;

	public Wallet() {
		System.out.println("no org const wallet");

	}

	public Wallet(String colore, double cost, String shop) {

		this.colore = colore;
		this.cost = cost;
		this.shop = shop;

	}
	public void init(Cards cards) {
		this.cards=cards;
	}

	public void display() {
		System.out.println("colore:"+this.colore);
		System.out.println("cost:"+this.cost);
		System.out.println("shop:"+this.shop);

		if(cards!=null) {
			this.cards.display();
		}else {
			System.err.println("this card is not pointing to memory");
		}
			
			
			
	}

}
