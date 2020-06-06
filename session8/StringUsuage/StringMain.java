package org.session8.StringUsuage;

import java.util.StringTokenizer;

public class StringMain {
	
	public static void main(String[] args) {
		String s1="Hi";
		String s2=new String("Hi");
		char[] c= {'H','i'};
		String s3=new String(c);
		char[] c1= {'M','A','P','P','L','E'};
		String s4=new String(c1,0,4);// prints from 0 to 3.(0 to  n-1)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// String Useful Methods:
		System.out.println("Character at index 1 is :"+ s1.charAt(1));
		System.out.println("Length of the string is :"+ s2.length());
		System.out.println("SubString of a given string is :"+s4.substring(1,3));
		
		String s5="sai how are you?";
		String[] divide=s5.split(" ");
		for(String d : divide) {
			System.out.println(d);
		}
		
		System.out.println("Starting String  in a string is :"+ s5.startsWith("Sai"));
		System.out.println("ending String in a string is :"+ s5.endsWith("you?"));
		//
		
		String s6="Hello";
		String s7="Hello";
		String s8= new String("Hello");
		String s9= new String("Hello");
		String s10=s9;
		System.out.println(s6==s7);
		System.out.println(s7==s8);
		System.out.println(s8.equals(s9));
		System.out.println(s9==s10);
		
		
		
		
		
		
	
		
		
	}

}
