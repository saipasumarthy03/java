package org.session6.randomdemo;
import java.util.Random;


public class RandomMain {
	public static void main(String[] args) {
		Random value=new Random(10);
		for(int i=0;i<=10;i++) {
			System.out.println(value.nextInt());
		}
	}

}
