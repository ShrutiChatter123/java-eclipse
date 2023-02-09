package com.xworkz.pattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;// it is the number which the factorial has to found

		int fact = 1;// to store the factorial value

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}

		System.out.println("The factorial of " + n + " is " + fact);

	}
}
