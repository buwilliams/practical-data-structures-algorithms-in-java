package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList mylist = new DoublyLinkedList();
		mylist.insertFirst(1);
		mylist.insertFirst(2);
		mylist.insertFirst(3);
		mylist.insertLast(10);
		mylist.insertLast(20);
		mylist.insertLast(30);
		mylist.displayForward();
		mylist.displayBackward();
		
		mylist.deleteFirst();
		mylist.deleteLast();
		mylist.deleteKey(10);
		mylist.displayForward();
		
		mylist.insertAfter(1, 10);
		mylist.insertAfter(2, 3);
		mylist.displayForward();
	}

}
