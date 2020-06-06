package org.session6.Polymorphism;

public class MethodOverloading {
	public static int  add(int p,int q) {
		return p+q;
		
	}
	
	
	public static void add(String p, String q)
	{
		
	}
	public static void add(int p, String q)// order of arguments also comes to consideration
	{
		
	}
	public static void add(int p,int q , int r)
	{
		
	}
	public static void add(String q,int p)// above arguments are same but if we consider the order they are different.
	{
		 System.out.println(q +","+ p);
	}
	 public static void main(String[] args) {
		System.out.println(add(1,2));
		add("sai",20);
	
	 }
	

}
