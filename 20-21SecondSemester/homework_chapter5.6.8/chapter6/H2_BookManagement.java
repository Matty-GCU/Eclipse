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
		addBook(books, "�鼮1","����1","������1");
		addBook(books, "�鼮2","����2","������2");
		addBook(books, "�鼮3","����2","������3");
		searchBook(books, "�鼮3");
		deleteBook(books, "�鼮3");
		searchBook(books, "�鼮3");
	}
	public String searchBook(Book[] bookArray, String title) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
				System.out.println("��ѯ�ɹ���");
				return title;
			}
		}
		System.out.println("��ѯʧ�ܣ�");
		return null;
	}
	public int addBook(Book[] bookArray, String title, String writer, String publisher) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] == null) {
				bookArray[i] = new Book(title, writer, publisher);
				System.out.println("��ӳɹ���");
				return 1;
			}
		}
		System.out.println("���ʧ�ܣ�");
		return 0;
	}
	public int deleteBook(Book[] bookArray, String title) {
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i].getTitle().equals(title)) {
				bookArray[i] = null;
				System.out.println("ɾ���ɹ���");
				return 1;
			}
		}
		System.out.println("ɾ��ʧ�ܣ�");
		return 0;
	}
	
}


