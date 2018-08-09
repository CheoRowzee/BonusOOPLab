package com.oop;

public class Book {
	
	private String Isbn;
	private String author;
	private String title;
	private double price;
	
	
	public Book(String Isbn, String author, String title, double price) {
		super();
		Isbn = Isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public void Book(String Isbn, String author, String title, double price) {
		
	}


	public String getIsbn() {
		return Isbn;
	}


	public void setIsbn(String isbn) {
		Isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("ISBN: %-20s Author: %-20s Title %-20s Price $%-20s\n", Isbn, author, title, price);
	
	}
}
	
	
	
	
	


