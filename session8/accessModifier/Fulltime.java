package org.session8.accessModifier;

public class Fulltime extends Employee {
	public void calculatePay() {
		//super.login();/// can be accessed because it is protected
		super.logout();// even it can be accessed because it is default method
	}
	

}
