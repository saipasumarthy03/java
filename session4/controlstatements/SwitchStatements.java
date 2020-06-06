package org.session4.controlstatements;
import java.util.Scanner;


public class SwitchStatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day");
		String day=sc.next();
		
		
		switch (day) {
		
		case "monday" :
			System.out.println("today is working day");
			break;
		case "tuesday" :
			System.out.println("today is tuesday");
			break;
		case "wednesday" :
			System.out.println("today is wednesday");
			break;
		case "thursday" :
			System.out.println("today is thursday");
			break;
		case "friday" :
			System.out.println("today is friday");
			break;
		case "saturday" :
			System.out.println("today is saturday");
			break;
			default  :
				System.out.println("today is a holiday");
				break;
				
		}
		
		System.out.println("enter the color");
		String color=sc.next();
		switch (color)
		{
		case "red" :
			System.out.println("entered color is red");
			break;
		case "blue" :
			System.out.println("entered color is blue");
			break;
		default:
			System.out.println("entered color is neither red nor blue");
			break;
			
			
		}
		
	}

}
