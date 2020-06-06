package org.session2.datatypes;

public class Operations {
	
	static int add(int a, int b) {
		return a + b;
	}

	static int subtraction(int a, int b) {
		return a-b;
	}

	static int multiplicatiion(int a, int b) {
		return a * b;
	}

	static int divison(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int addResult = add(17, 15);
		System.out.println("sum of two integers is :" + addResult);
		
		int subtractionResult = addResult - 15;
		System.out.println("sum of 17 and 15 is 32 and subtracting 15 from 32 is : " + subtractionResult);
		
		int multiplicationResult = subtractionResult*4;
		System.out.println("after performing subtraction and multiplying with 4 the result is :" +multiplicationResult);
		 int divisionResult= multiplicationResult/15;
		 System.out.println("After performing multiplication and dividing by 15 the result is : " +divisionResult );
	}
}
