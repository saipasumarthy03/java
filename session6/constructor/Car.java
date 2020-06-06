package org.session6.constructor;

public class Car {
	String carname;
	int carnmbr;
	public Car(int number,String name) {
		carname=name;
		carnmbr=number;
		}
	public static void main(String[] args) {
		Car c1=new Car(5589,"honda");
		System.out.println(c1.carname);
		System.out.println(c1.carnmbr);
	}

}
