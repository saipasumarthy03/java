package org.session4.controlstatements;

import java.util.Scanner;

public class ControlStatements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String s = input.next();
		
		input.close();
		
	
		
		
		System.out.println(s.equals("hi"));
		if (input.equals("hi")) {
			System.out.println("user entered is hi");
		} else if (input.equals("bye")) {
			System.out.println("user entered is bye");
		} else if (input.equals("morning")) {
			System.out.println("user entered is morning");
		} else {
			System.out.println("user entered is :" + s);
		}
		//input.close();
		System.out.println(input);
	
		 

	}
}
