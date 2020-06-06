package org.session6.staticdemo;
import static java.lang.Math.*;

public class MathDemo {
	public static void main(String[] args) {
		Math.round(9.5);
		System.out.println(Math.round(20.5));
		System.out.println(Math.sqrt(25));
		//Since we imported lang.math no need to use Math all the time
		System.out.println(max(20,30));
		System.out.println(min(20,30));
		System.out.println(floor(20.5)); //To lower the value
		System.out.println(ceil(20.5)); // To upper the value
		System.out.println(sqrt(625));
	

}

}