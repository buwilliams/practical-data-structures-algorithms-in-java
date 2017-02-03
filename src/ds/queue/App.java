package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(3);
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.view();
		
		myQueue.remove();
		myQueue.view();
		
		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.view();
		
		System.out.println("Item: "+myQueue.remove());
		System.out.println("Item: "+myQueue.remove());
		myQueue.view();
		
		/*
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.view();
		
		System.out.println("Item: " + myQueue.remove());
		System.out.println("Item: " + myQueue.remove());
		System.out.println("Item: " + myQueue.remove());
		System.out.println("Item: " + myQueue.remove());
		
		
		System.out.println("Item: " + myQueue.remove());
		myQueue.view();
		
		myQueue.insert(10);
		myQueue.view();
		
		System.out.println("Item: " + myQueue.remove());
		System.out.println("Item: " + myQueue.remove());
		myQueue.view();
		*/
	}
}
