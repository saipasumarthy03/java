package org.session9.regularExpressions;

public class StringMatches {
	public static boolean validPhoneNumber(String phonenumber) {
	return phonenumber.matches("\\d{3}-\\d{3}-\\d{4}");
	}
	public static boolean validSSN(String ssn )
	{
		return ssn.matches("\\d{3}-\\d{3}-\\d{2}-\\d{2}");
	}
	public static boolean checkZip(String number)
	{
		return number.matches("\\d{5}-\\d{2}");
	}
	public static void main(String[] args) {
		System.out.println(validPhoneNumber("280-900-8989"));
		System.out.println(validSSN("01695223232"));
		System.out.println(checkZip("12345-33"));
	}
	
	
	
	

}
