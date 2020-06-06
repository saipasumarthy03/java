package org.session9.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {
	public static void main(String[] args) {
		List<String> colorsList = new ArrayList<String>();
		colorsList.add("red");
		colorsList.add("blue");
		colorsList.add("green");
		colorsList.add("orange");
		System.out.println(colorsList);
	// for loop
		for(int i=0;i<colorsList.size();i++)
		{
			System.out.println(colorsList.get(i));
		}
		
		System.out.println(",,................");
		//for each
		for(String colors:colorsList)
		{
			System.out.println(colors);
		}
		System.out.println(",,................");
		// for iterator
		for (Iterator iterator = colorsList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		System.out.println(",,................");
		//while
		Iterator<String> it=colorsList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(",,................");
			
		//lists Iterator are bidirectional(both forward and backward)
		//forward
		ListIterator<String>lit=colorsList.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println(",,................");
		
		//backward
		
		ListIterator<String>lbit=colorsList.listIterator(colorsList.size());
		while(lbit.hasPrevious()) {
			System.out.println(lbit.previous());
			
		}
}
}
