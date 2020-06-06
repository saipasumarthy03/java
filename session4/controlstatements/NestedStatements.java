package org.session4.controlstatements;
import java.util.Scanner;


public class NestedStatements {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your agee");
		int age=scanner.nextInt();
		checkage(age);
		System.out.println("enter your age");
		 age=scanner.nextInt();
		 checkage(age);
		 scanner.close();
	}
	 public static void  checkage(int age)
	 {
		 if(age==13)
		 {
			 System.out.println("he/she is too small ");
		 }
		 else if(age<19)
		 {
			 System.out.println("you are a teenager");
		 }
		 else
		 {
			 if(age<65) {
				 System.out.println("you are an adult");
			 }
			 else {
				 System.out.println("you are no more an adult ");
			 }
			 System.out.println("since you are older than 19 you deserve a drink");
		 }
			 
		 
		
		
		
		
		
	}

}
