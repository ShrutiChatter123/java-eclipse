package com.xworkz.rename.boot;

public class Imagee {

	public String name;
	public int width;
	public String type;
	public float size;
	public int height;
	public int cost;
	public String colore;
	public String location;
	public String cameraMan;
	public boolean good;
	
	public Imagee(String arg1) {
		name=arg1;
	}
	
	public Imagee(int arg2) {
		width=arg2;
	}
	
	public Imagee(int arg2,String arg3) {
		width=arg2;
		type=arg3;
	}
	
	 public Imagee(String arg1,float arg4) {
		 name=arg1;
		 size=arg4;
	 }
	 public Imagee(String arg3,int arg5) {
		 type=arg3;
		 height=arg5;
	 }
	
	 public Imagee(int arg5,String arg1,int arg6,String arg7,String arg8) {
		 height=arg5;
		 name=arg1;
		 cost=arg6;
		 colore=arg7;
		 location=arg8;
		 
	 }

	public Imagee(String arg9,boolean arg10) {
		cameraMan=arg9;
		good=arg10;
		
	}

	public void display() {
		System.out.println("name:"+name);
		System.out.println("width:"+width);
		System.out.println("type:"+type);
		System.out.println("size:"+size);
		System.out.println("height:"+height);
		System.out.println("cost:"+cost);
		System.out.println("colore:"+colore);
		System.out.println("location:"+location);
		System.out.println("cameraman:"+cameraMan);
		System.out.println("Good:"+good);
		
	}
	
	
	
	
	
	
	
}

