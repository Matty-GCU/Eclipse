package homework2;

public class Book {
	String title;
	String writer;
	String price;
	String publisher;
	public Book() {}
	public Book(String title, String writer, String price, String publisher) {
		setTitle(title);
		setWriter(writer);
		setPrice(price);
		setPublisher(publisher);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
}
