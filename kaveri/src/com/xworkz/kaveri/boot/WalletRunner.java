package com.xworkz.kaveri.boot;

import com.xworkz.kaveri.thing.Cards;
import com.xworkz.kaveri.thing.Wallet;

public class WalletRunner {

	public static void main(String[] args) {
		Wallet wallet=new Wallet("pink",5555,"sairam");
		wallet.display();
		Cards cards=new Cards("SBI","yello",434D);
		cards.display();
	}

}
