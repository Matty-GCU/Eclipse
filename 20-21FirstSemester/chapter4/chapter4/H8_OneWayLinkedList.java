package chapter4;
import java.util.Scanner;
//用循环实现链表结构
public class H8_OneWayLinkedList {
	H8_Students sHead;
	
	void createList() {
		Scanner reader = new Scanner(System.in);
		H8_Students s = null;
		H8_Students t;
		System.out.println("Type id:");
		String id = reader.next();
		System.out.println("Type name:");
		String name = reader.next();
		
		while(! id.equals("-1")) {
			t = new H8_Students();
			t.setID(id);
			t.setName(name);
			if(sHead == null) {
				sHead = t;
				s = t;
			}
			else {
				s.setNext(t);
				s = t;
				//s = s.Next;
			}
			System.out.println("Type id:");
			id = reader.next();
			System.out.println("Type name:");
			name = reader.next();
		}
		
		reader.close();
	}
	
	void print() {
		H8_Students t = sHead;
		while(t != null) {
			System.out.println("ID: " + t.getID() + ", Name :" + t.getName());
			t = t.getNext();
		}
	}
	
	void search(String name) {
		H8_Students t = sHead;
		while(t != null) {
			if(t.getName().equals(name)) {
				System.out.println("ID: " + t.getID() + ", Name :" + t.getName());
				break;
			}
			t = t.getNext();
		}
	}
	
	public static void main(String[] args) {
		H8_OneWayLinkedList list = new H8_OneWayLinkedList();
		list.createList();
		list.print();
		list.search("WU");
	}
}
//20201219