package org.session4.controlstatements;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no.of marks obtained :");
		int marksObtained = sc.nextInt();

		//if (marksObtained >= 80) {
		//	System.out.println("you got A grade");

	//	} else {
		//	System.out.println("you got B grade");
		//}To use ternary operator
		System.out.println(marksObtained >=80 ? "you got A grade ":"you got B grade");
		String value= marksObtained >=80 ? "you got A grade ":"you got B grade";
		System.out.println(value);

	}
}
