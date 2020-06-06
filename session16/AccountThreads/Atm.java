package org.session16.AccountThreads;

public class Atm implements Runnable{

	private Account account;
	 public Atm(Account account)
	 {
		 this.account=account;
	 }
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				account.withdraw(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
	 

}
