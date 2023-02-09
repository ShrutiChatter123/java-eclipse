package com.xworkz.pattern;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Shruti";
		String str = "";

		char[] ch = name.toCharArray(); 

		for (int i = ch.length - 1; i >= 0; i--) {
			str += ch[i];
		}

		System.out.println(str);

	}

}
