package org.session16.AccountThreads;

import java.io.Serializable;

public class Account implements Serializable {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	 
	public synchronized void deposit(double amount)
	{
		balance=balance+amount;
		
		
		
		
		
	}
	public synchronized void withdraw(double amount) {
		balance=balance-amount;
	}

}
