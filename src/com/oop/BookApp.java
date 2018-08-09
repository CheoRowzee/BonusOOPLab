package com.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numBooks;
		String bookNum;
		String author = null;
		String title = null;
		double price = 0;
		int userNum = 0;
		String answer = null;
		
		
		
		System.out.println("Welcome to the book app!");
		System.out.println("How many books would you like to enter?  ");
		userNum = scan.nextInt();
		scan.nextLine();
		
		
		
		Book b = new Book("93612", "Rick Riordan", " Lightening", 19.00);
		
		ArrayList <Book> bookList = new ArrayList<>();
		
		do{
		for(int i = 0; i < userNum; i++ )  {
		
		System.out.println("Please enter author of the book: ");
		author = scan.nextLine();
		System.out.println("Please enter the title of the book: ");
		title = scan.nextLine();		
		System.out.println("Please enter the ISBN #: ");
		bookNum = scan.nextLine();
		System.out.println("Please enter the price of the book: ");
		price = scan.nextDouble();
		scan.nextLine();
		
		bookList.add(new Book(bookNum, author, title, price));
		}
		
		
		System.out.println("BookLIst:  ");
		for(Book list : bookList) {
			System.out.println(list);
		}
		
		System.out.println("Would you like to add another book? Yes or No");
		answer = scan.nextLine();
		}while(answer.equalsIgnoreCase("Yes"));
		
		
		System.out.println("Thank you for using the Book App!");
	}
	

	

}
