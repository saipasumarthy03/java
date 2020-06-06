package org.session3;
import java.util.Scanner;

public class Keyboardinput {
  
 public static void main(String[] args) {
	System.out.println("enter two numbers");
	Scanner scanner=new Scanner(System.in);
	int first= scanner.nextInt();
	int second =scanner.nextInt();
	
	
	
	
	System.out.println("sum of two numbers is " + (first+second));
	System.out.println("enter the name of the person ");
			
	String file=scanner.next();
	System.out.println(file);
	
	
	scanner.close();
	
}
  

}
