package org.session15.SingletonClass;

public class  Book {
	private String name;
	private int id;
	private String authour;
	//public static Book book=new Book();
	private static Book book;
	
	private Book()
	{
		if(book!=null)
			throw new RuntimeException();
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", authour=" + authour + "]";
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	/*
	 * public static void setBook(Book book) { Book.book = book; }
	 * 
	 */
	
	/*
	 * public static Book getBook() { return book; }
	 */

public static Book getInstanceOfBook() {
	if(book==null)
	{
		book=new Book();
	}
	return book;
}
}
