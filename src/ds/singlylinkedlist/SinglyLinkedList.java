package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node currentFirst = first;
		first = first.next;
		return currentFirst;
	}
	
	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void insertLast(int data) {
		Node currentNode = first;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}
}
