package org.session3.PassByValue;

import org.session3.encapsulation.Book;

public class PassByValue {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setPages(1000);
		System.out.println("No.of pages in book :" + b1.getPages());
		System.out.println("book object :" + b1);
		b1 = testMethod(b1);
		System.out.println("after returning no.of pages :"+b1.getPages());
		System.out.println("book object :"+b1);
	}

	public static  Book testMethod(Book b1) {
		b1 = new Book();
		System.out.println("the test method in :" + b1);
		b1.setPages(2000);
		System.out.println("No.of pages in test method :" + b1.getPages());
		return b1;
	}

}
