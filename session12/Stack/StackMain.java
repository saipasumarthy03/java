package org.session12.Stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String>colors=new Stack<>();
		colors.push("red");
		colors.push("yellow");
		colors.push("blue");
		for(String color:colors)
		{
			System.out.println(color);
		}
		System.out.println("...............");
		System.out.println(colors.pop());//-- to remove the element from the list
		System.out.println(colors);//
		System.out.println(colors.peek());// --Prints the top element in the stack
		System.out.println(colors.remove(0));
		System.out.println(colors);
		System.out.println(colors.get(0));
		
	}

}
