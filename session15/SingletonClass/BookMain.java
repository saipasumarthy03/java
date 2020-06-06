package org.session15.SingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BookMain {
	public static void main(String[] args) {
		/*
		 * Book b=Book.getBook(); System.out.println(b);
		 */
		
		Book b1=Book.getInstanceOfBook();
		b1.setId(1);
		b1.setAuthour("sai");
		b1.setName("sai pasumarthy");
		System.out.println(b1);
		Book b2=Book.getInstanceOfBook();
		b2.setAuthour("kumar");
		b1.setId(2);
		b2.setName("kumar jh");
		System.out.println(b2);
		System.out.println(b1);
		
		//breaking singleton by reflection
		try {
			Class bookclass=Class.forName(Book.class.getName());
			Constructor<Book> constructor= bookclass.getDeclaredConstructors()[0];
			constructor.setAccessible(true);
				Book b5=constructor.newInstance();
				Book b6=constructor.newInstance();
				b6.setName("marrygold");
				b5.setAuthour("john");
				System.out.println(b5);
				System.out.println(b6);
			} catch (InstantiationException |IllegalAccessException |IllegalArgumentException |InvocationTargetException |ClassNotFoundException e) {
				
				e.printStackTrace();
			
		}
		

		
		
	}

}
