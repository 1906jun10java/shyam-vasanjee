package com.revature.books;

public class Book {
	private String Title;
	private String Author;

	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author) {
		super();
		Title = title;
		Author = author;

	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Author=" + Author + "]";
	}

	
	
	}
	
	
	


