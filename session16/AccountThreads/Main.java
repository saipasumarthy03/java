package org.session16.AccountThreads;

public class Main {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setBalance(10000);
		Atm atm=new Atm(acc);
		Company company=new Company(acc);
		Thread t1=new Thread(atm);
		Thread t2=new Thread(company);
		t2.start();
		t1.start();
		
		System.out.println(acc.getBalance());
		
		
		
		
		
	
		
		
		
	}

}
