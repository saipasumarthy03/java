package org.session6.thisInfo;

public class ThisIsfun {
	int a;
	int b;
	public void fun(int a, int b)
	{
		a=a;
		b=b;
	}
	public void test(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
public static void main(String[] args) {
	ThisIsfun t= new ThisIsfun();
/*	t.a=10;
	t.b=20;
	System.out.println(t.a);
	System.out.println(t.b); */
	t.fun(10, 20);
	System.out.println(t.a);
	System.out.println(t.b);
	t.test(2, 20);
	System.out.println(t.a);
	System.out.println(t.b);
	
	
	
}
}
