package org.session3.encapsulation;

public class Book {
	private int price;
	String author;
	  String bname;
	  private  int pages;
	  

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPrice(int price) {
		
		/*  if (bname.equals("money") && price > 300) {
		System.out.println("please check the book price " + price); 
		return
		}*/
		 
		this.price = price;// refers to the current object
	}

	public int getPrice() {
		return price;
	}
	
}
