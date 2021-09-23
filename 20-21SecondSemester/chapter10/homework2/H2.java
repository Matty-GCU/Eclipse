package homework2;

public class H2 {

	public static void main(String[] args) {
		Book book1 = new Book("书1", "作者a", "价格20刀", "华广出版社");
		Book book2 = new Book("书2", "作者b", "价格20刀", "华广出版社");
		Book book3 = new Book("书3", "作者c", "价格20刀", "华广出版社");
		BookManager bookManager = new BookManager(); 
		bookManager.add(book1);
		bookManager.add(book2);
		bookManager.add(book3);
		bookManager.search("书2");
	}

}
