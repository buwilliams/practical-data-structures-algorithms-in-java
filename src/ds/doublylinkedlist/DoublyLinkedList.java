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
	
	public Node deleteFirst() {
		if(isEmpty()) return null;
		
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
		if(isEmpty()) return null;
		
		Node currentLast = last;
		
		if(first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		
		last = last.previous;
		
		return currentLast;
	}
	
	// TODO: insertBefore()
	
	public Node insertAfter(int key, int data) {
		Node current = first;
		
		while(current.data != key) {
			current = current.next;
			if(current.next == null) return null;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		current.next = newNode;
		newNode.previous = current;
		
		return newNode;
	}
	
	public Node deleteKey(int key) {
		if(isEmpty()) return null;
		
		Node current = first;
		
		while(current.data != key) {
			current = current.next;
			if(current == null) return null;
		}
		
		if(current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.print("List (first -> last): ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackward() {
		System.out.print("List (last -> first)");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println("");
	}
}
