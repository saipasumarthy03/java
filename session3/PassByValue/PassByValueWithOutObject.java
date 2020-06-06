package org.session3.PassByValue;

public class PassByValueWithOutObject {
	int x=20;
	static int y;
	public static void main(String[] args) {
		int x=21;
		modify(x);
		System.out.println(x);
		y=21;
		modify1(y);
		System.out.println(y);
		int b=30;
		modify2(b);
		System.out.println(b);
		int a = 20;
		a=a+20;
		test(a);
		System.out.println(a);
	}

	public static int test(int a) {
		a =a+25;
		System.out.println("print the value of a :" + a);
		return a;
	}
	public static void modify(int x)
	{
		x=x+1;
		System.out.println(x);
		
	}
	public static void modify1(int y) {
		y=y+1;
		System.out.println("y in :" +y);
	}
	public static void modify2(int b) {
		b++;
		System.out.println(" b is :"+b);
				
	}
	
	
}
