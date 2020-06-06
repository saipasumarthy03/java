package org.session16.Threads;

import java.util.concurrent.TimeUnit;

public class Test implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(5);
			System.out.println("thread runnable interface executed successfully");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
