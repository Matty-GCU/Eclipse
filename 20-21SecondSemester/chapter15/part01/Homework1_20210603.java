package part01;

import java.util.LinkedList;

public class Homework1_20210603 {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.print();
		System.out.println(bookService.searchByPrice().toString());
	}

}

class BookService {
	LinkedList<Book> books;
	Book book1, book2, book3;
	BookService() {
		book1 = new Book("书1", "30.5", "人民教育出版社", "151-165-165");
		book2 = new Book("书2", "33.5", "北京大学出版社", "152-165-165");
		book3 = new Book("书3", "29.9", "航空工业出版社", "153-165-165");
		books = new LinkedList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
	}
	public void print() {
		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}
	public Book searchByPrice() {
		double maxPrice = 0;
		int maxPriceIndex = 0;
		for(int i = 0; i < books.size(); i++) {
			double thePrice = Double.parseDouble(books.get(i).getPrice());
			if(thePrice > maxPrice) {
				maxPrice = thePrice;
				maxPriceIndex = i;
			}
		}
		return books.get(maxPriceIndex);
	}
}

class Book {
	String title, price, publisher, ISBN;
	
	public Book(String title, String price, String publisher, String ISBN) {
		setTitle(title);
		setPrice(price);
		setPublisher(publisher);
		setISBN(ISBN);
	}
	public String toString() {
		return getTitle() + " " + getPrice() + " " + getPublisher() + " " + getISBN();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}