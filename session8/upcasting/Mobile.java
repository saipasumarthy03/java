package org.session8.upcasting;

public class Mobile extends Electronics {

	@Override
	public void turnOn() {
		System.out.println("mobile is...... ");
	}

	@Override
	public void turnOff() {
		System.out.println("low battery :about to die");
	}

	public void calling() {
		System.out.println("mobile is ringing");
	}
}
