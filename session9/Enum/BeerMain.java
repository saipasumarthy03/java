package org.session9.Enum;

public class BeerMain {
	public static void main(String[] args) {
		Beer[] b=Beer.values();
		for(Beer b1: b)
		{
			System.out.println("The name of the beer is :"+b1  + "and price of the beer is: "+b1.getPrice());
		}
	}

}
