package chapter6;

public class H2_BookManagement {
	public static void main(String[] args) {
		BookManager bookManager = new BookManager();
	}
}

class Book {
	String title, writer, publisher;
	Book() {
	};
	Book(String title, String writer, String publisher) {
		setTitle(title);
		setWriter(writer);
		setPublisher(publisher);
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setTitle(String s) {
		title = s;
	}
	public void setWriter(String s) {
		writer = s;
	}
	public void setPublisher(String s) {
		publisher = s;
	}
}

interface IManager {
	public abstract String searchBook(Book[] bookArray, String title);
	public abstract int addBook(Book[] bookArray, String title, String writer, String publisher);
	public abstract int deleteBook(Book[] bookArray, String title);
}

class BookManager implements IManager {
	Book[] books;
	BookManager() {
		books = new Book[20];
		addBook(books, "书籍1","作者1","出版社1");
		addBook(books, "书籍2","作者2","出版社2");
		addBook(books, "书籍3","作者2","出版社3");
		searchBook(books, "书籍3");
		deleteBook(books, "书籍3");
		searchBook(books, "书籍3");
	}
	public String searchBook(Book[] bookArray, String title) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
				System.out.println("查询成功！");
				return title;
			}
		}
		System.out.println("查询失败！");
		return null;
	}
	public int addBook(Book[] bookArray, String title, String writer, String publisher) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] == null) {
				bookArray[i] = new Book(title, writer, publisher);
				System.out.println("添加成功！");
				return 1;
			}
		}
		System.out.println("添加失败！");
		return 0;
	}
	public int deleteBook(Book[] bookArray, String title) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i].getTitle().equals(title)) {
				bookArray[i] = null;
				System.out.println("删除成功！");
				return 1;
			}
		}
		System.out.println("删除失败！");
		return 0;
	}
	
}


