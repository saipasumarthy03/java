package org.session3.PassByValue;

import org.session3.encapsulation.Book;

public class PassByValueWithObjects {

	public static void main(String[] args) {
		Book book = new Book();
		
		book.setPrice(200);

		System.out.println("Price of the book:" + book.getPrice());
		System.out.println("Book object: " + book);
		System.out.println("--------------------------------------");

		book = checkObject(book);
		System.out.println("Price again after check object: " + book.getPrice());
		System.out.println("Book object after check object method:" + book);
	}

	public static Book  checkObject(Book book) {
		// book = new Book();
		System.out.println("New Book object:" + book);
		System.out.println("------------------------------------------");
		book.setPrice(100);
		book.setPages(25);
		System.out.println("Price in check object method: " + book.getPrice());
		System.out.println("Book object in check object method: " + book);
		System.out.println("------------------------------------------");

		return book;
	}
}
