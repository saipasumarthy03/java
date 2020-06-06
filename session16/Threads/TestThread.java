package org.session16.Threads;

public class TestThread extends Thread {
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("print something......Thread is executed");
			System.out.println(Thread.currentThread().getState());
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	

}
