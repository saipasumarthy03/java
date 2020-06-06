package org.session2.datatypes;

public class Methods {
	static void sum() {
		System.out.println("add two numbers");
	}

	static int testValue() {
		return 10;
	}

	static int add(int a, int b) {
		return a + b ;//+ testValue();
	}

	static void printsum(int a, int b) {
		System.out.println(a + b + testValue());
	}
	static int test(int y)
	{
	//return testValue() +y;	
		return add(2,3)+y;
	}
	static int mult(int a,int b)
	{
		return a*b;
	}
	
	static void performAddMult(int a,int b)
	{
		int addresult=add(a,b);
		int mulresult=mult(a,b);
		System.out.println(add(addresult,b));
		System.out.println(mult(mulresult,b));		
	}

	public static void main(String[] args) {
		int res=testValue();
		System.out.println(res);
		int result = add(10, 40);
		//System.out.println(result);
		//System.out.println(add(result, 40));
		//System.out.println(add(result, 7));
		//printsum(20, 60);
		
		//System.out.println(test(20));
		//performAddMult(10,20);
		//System.out.println(testValue());
		printsum(20,20);
	
		
		

	}

}
