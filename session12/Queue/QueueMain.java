package org.session12.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<String>fruits=new LinkedList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.offer("avacado");
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		System.out.println(fruits.peek());
		System.out.println(fruits.element());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		
		System.out.println(fruits.peek());
		//System.out.println(fruits.element()); throws an no such element exception list is empty.
		
		
		


	}

}
