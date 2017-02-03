package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(50);
		mylist.insertFirst(40);
		mylist.insertFirst(30);
		mylist.insertFirst(20);
		mylist.insertFirst(10);
		
		mylist.deleteFirst();
		mylist.deleteFirst();
		
		mylist.insertLast(999);
		
		mylist.insertFirst(5);
		
		mylist.insertLast(9999);
		
		mylist.displayList();
	}

}
