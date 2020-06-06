package org.session8.upcasting;

public class ElectronicsMain {

	public static void main(String[] args) {
		
		/*
		 * Electronics e = new Electronics(); e.setCost(20);
		 * 
		 * System.out.println(e.getCost());
		 */
		Electronics nokia = new Mobile();
		nokia.turnOn();
		nokia.setModelno(2200);
		nokia.setCompanyName("NOKIA");
		Electronics lg = new Tv();
		lg.turnOn();
	}
}
