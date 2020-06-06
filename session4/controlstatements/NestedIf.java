package org.session4.controlstatements;
import java.util.Scanner;


public class NestedIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day");
		String day=sc.next();
		checkDay(day);
		sc.close();
		}
	public static void checkDay(String day)
	{
		if(day.equals("monday"))
		{
		 System.out.println("its a working day");
		}
		else if(day.equals("tuesday"))
		{
		System.out.println("working day");
		}
		else if(day.equals("wednesdsay"))
		{
		System.out.println("working day");
		}
		else if(day.equals("thursday"))
		{
			System.out.println("working day");
		}
		else if(day.equals("friday"))
		{
			System.out.println("working day");
		}
		else {
			if(day.equals("saturday"))
			{
				System.out.println("may or may be a working day");
			}
			else
			{
				System.out.println("its a holiday");
			}
			System.out.println("bye");
		}
		System.out.println("Good bye");
	}

}
