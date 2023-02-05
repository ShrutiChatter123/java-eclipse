package com.xworkz.rename.thing;

import com.xworkz.rename.boot.Message;

public class MessageRunner {

	public static void main(String[] args) {
	Message Message=new Message("haveri");
	Message.display();
	System.out.println("   ");

	Message Message1=new Message("haveri","badravati");
	Message.display();
	System.out.println("");
	
	Message Message2=new Message("haveri",2023);
	Message.display();
	System.out.println("   ");
	
	Message Mssage3=new Message("haveri",2023,"badravati");
	Message.display();
	System.out.println("  ");
	
	Message Message4=new Message(true);
	Message.display();
	System.out.println("  ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
