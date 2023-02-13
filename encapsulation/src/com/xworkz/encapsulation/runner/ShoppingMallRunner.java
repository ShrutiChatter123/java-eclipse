package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.java.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
	
		 ShoppingMall shoppingMall =new  ShoppingMall();
		 shoppingMall.setName("kaveri");
		 shoppingMall.setLocation("bagalkot");
		 shoppingMall.setBudget(78987698);
		 
		 shoppingMall.getName();
		 shoppingMall.getLocation();
		 shoppingMall.getBudget();
		 
		 
		 shoppingMall.display();

	}

}
