package org.session9.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLoopModification {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		
		// colors.forEach(color -> System.out.println(color));

		// ListIterator
		/*ListIterator<String> colorlit = colors.listIterator();
		while (colorlit.hasNext()) {
			String color = colorlit.next();
			System.out.println(color);
			if (color.equals("blue"))
				colorlit.add("pink");
		}*/
		
		
		//remove
		
		/*for(String color:colors) {
			System.out.println(color);
			if(color.equals("red")) {
				System.out.println("Entered if");
				colors.remove("red");
				//System.out.println(colors);
			}
			System.out.println("Color:"+colors);
		}*/
		// remove using iteartor
		Iterator<String>colorit=colors.iterator();
		while(colorit.hasNext())
		{
			String color=colorit.next();
			System.out.println(color);
			if(color.equals("red"))
			colorit.remove();
			
		}
		System.out.println("Color:"+colors);
		
		//update
		/*for(String color:colors) {
			System.out.println(color);
			if(color.equals("red"))
				colors.set(1,"pink");
		}*/
	}
}

