package org.session16.Threads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method thread");
		
		Thread t1=new TestThread();
		t1.setName("Thread-1");
		t1.start();
		Test t= new Test();
		Thread t2=new Thread(t,"Thread-2");// for runnable interface we create the instance and pass instance to thread
		t2.start();
		t2.join();
		
		t1.join();
		
		
		
	}

}
