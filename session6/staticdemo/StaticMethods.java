package org.session6.staticdemo;

public class StaticMethods {

	int y = 11;
	static int x = 20;
	public static void testing()
	{
		System.out.println(x);
	}
	

	public static void print(int z) {
		x = x + 1;
		System.out.println("value of x in static method : " + x);
		//testing();
		
		
	}

	public void test(int y) {
		//System.out.println("value of x in non static method :" + x);
		y = y + 1;
		System.out.println("value of y is :" + y);
		//testing();
	}
	public void help(int q)
	{
		q=20;
		System.out.println(q);
	}
	public void see(int a )
	{
		a=a+1;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		 int a=20;
		StaticMethods sm = new StaticMethods();
		sm.see(a);
		
		System.out.println(a);
		 print(x);
		int y=24;
		/*sm.help(y);
		System.out.println(y);
		
		
		
		
		//sm.test();
		print(x);
		System.out.println(x);*/
		sm.test(y);
		System.out.println(y);
		testing();
	}
}
