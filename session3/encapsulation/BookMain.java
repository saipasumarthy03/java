package org.session3.encapsulation;

public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bname = "money";
		b1.author = "gale";
		b1.setPrice(100);

		Book b2 = new Book();
		b2.bname = "money";
		b2.author = "gale shapley";
	    b2.setPrice(1000);

		
		System.out.println(b1.getPrice());
		System.out.println(b2.getPrice());
		//b2.helpPrint();
		

	}

}
