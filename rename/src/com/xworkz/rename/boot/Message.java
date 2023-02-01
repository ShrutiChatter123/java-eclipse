package com.xworkz.rename.boot;

public class Message {

	public String from;
	public String to;
	public int year;
	public double time;
	public boolean reply;
	
	
	public Message(String arg1) {
		from=arg1;
	}
	
	
	public Message(String arg1,String arg2) {
		from=arg1;
		to=arg2;
	}
	public Message( String arg1,int arg3) {
		from=arg1;
		year=arg3;
	}
	public Message( String arg1,int arg3,String arg2) {
		from=arg1;
		year=arg3;
		to=arg2;
	}
	
	public Message(boolean arg4) {
		reply=arg4;
	}
	
public void display() {
	System.out.println("from:"+ from);
	System.out.println("to:"+to);
	System.out.println("year:"+ year);
	System.out.println("time:"+time);
	System.out.println("reply:"+ reply);
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
