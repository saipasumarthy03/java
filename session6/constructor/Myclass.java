package org.session6.constructor;

public class Myclass {
	int x; //create a class attribute
	public Myclass()
	{
		x=5;// set the initial value for class attribute
	}
	public static void main(String[] args) {
		Myclass obj=new Myclass();// constructor is called since object is created
		System.out.println(obj.x);
	}

}
