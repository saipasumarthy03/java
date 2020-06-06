package org.session6.constructor;

public class ConsParameters {
	 private int x;
	int y;
	public ConsParameters(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void info()
	{
		System.out.println("value of x is :"+x +"," +"value of y is :"+y );
	}
public static void main(String[] args) {
	ConsParameters value=new ConsParameters(20,30);
	System.out.println(value.x);
	System.out.println(value.y);
	value.info();
}
}
