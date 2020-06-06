package org.session12.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueMain{

	public static void main(String[] args) {
		Deque<String>colors=new LinkedList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("pink");
		colors.addFirst("brown");
		colors.addLast("green");
		System.out.println(colors);
		System.out.println(colors.poll());
		System.out.println(colors.peek());
		System.out.println(colors.pollFirst());
		System.out.println(colors.pollLast());
		

	}

}
