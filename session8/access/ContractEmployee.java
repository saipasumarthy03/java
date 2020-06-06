package org.session8.access;

import org.session8.accessModifier.Employee;

public class ContractEmployee extends Employee {
	 void calculatePay()
	 {
		 System.out.println(x);
		 super.login();// can be access because login method is protected in diff class
	//	 super.logout();// is not visible because it is default method in diff pacakage access withn in the package only.
		 
	 }
	

}
