package homework2;

public class H2 {

	public static void main(String[] args) {
		Book book1 = new Book("��1", "����a", "�۸�20��", "���������");
		Book book2 = new Book("��2", "����b", "�۸�20��", "���������");
		Book book3 = new Book("��3", "����c", "�۸�20��", "���������");
		BookManager bookManager = new BookManager(); 
		bookManager.add(book1);
		bookManager.add(book2);
		bookManager.add(book3);
		bookManager.search("��2");
	}

}
