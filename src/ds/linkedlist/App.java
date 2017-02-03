package ds.linkedlist;

public class App {

	public static void main(String[] args) {
		Node a = new Node();
		a.value = 4;
		
		Node b = new Node();
		b.value = 3;
		
		Node c = new Node();
		c.value = 7;
		
		Node d = new Node();
		d.value = 8;
		
		a.next = b;
		b.next = c;
		c.next = d;
		
		System.out.println("Length: " + listLength(a));
		System.out.println("Length: " + listLength(b));
		System.out.println("Length: " + listLength(c));
		System.out.println("Length: " + listLength(d));
	}
	
	public static int listLength(Node a) {
		int length = 1;
		Node currentNode = a;
		while(currentNode.next != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
