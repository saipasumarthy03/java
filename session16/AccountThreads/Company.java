package org.session16.AccountThreads;

public class Company implements Runnable {
	private Account account;
	public Company(Account account)
	{
		this.account=account;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				account.deposit(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
	

}
