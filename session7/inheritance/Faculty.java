package org.session7.inheritance;

public class Faculty extends Person{
	
	public Faculty()
	{
		System.out.println("nothing");
	}
	
	
	
	public void teaches()
	{
		System.out.println(" Faculty teaches the subject");
	}
	@Override
	public void login()
	{
		System.out.println("faculty login is processing");
	}
/*	public void logout() // cannot over ride the final method
	{
	}*/
	
	public void test()
	{
		System.out.println("i am inside faculty method");
	}
	
	
    
}
