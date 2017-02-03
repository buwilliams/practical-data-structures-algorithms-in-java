package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
	}
	
	// assume non-empty list
	
	public Node deleteFirst() {
		Node currentFirst = first;
		
		if(first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		
		first = first.next;
		
		return currentFirst;
	}
	
	public Node deleteLast() {
		Node currentLast = last;
		
		if(first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		
		last = last.previous;
		
		return currentLast;
	}
}
