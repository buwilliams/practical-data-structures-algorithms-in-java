package ds.queue;

public class Queue {

	// first in, first out (FIFO)
	// first come, first serve (fair data structure)
	
	protected int maxSize; // initializes the set number of slots
	protected long[] queueArray;
	protected int front; // index position for the element in the front
	protected int rear; // index position for the element at the back of the line
	protected int nItems; // counter to maintain the number of the items
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear = -1; // there is no last item yet
		this.nItems = 0; // no items yet
	}
	
	public void insert(long item) {
		if(rear == maxSize - 1) { // Circular Queue
			rear = -1;
			front = (maxSize > 1) ? 1 : 0;
		}
		
		this.rear++;
		//this.front++;
		this.queueArray[this.rear] = item;
		
		if(!isFull()) this.nItems++;
	}
	
	public long remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty. this.front="+this.front+", this.rear="+this.rear);
			return -1;
		}
		
		long old_item = this.queueArray[this.front];
		this.front = (this.front + 1 == this.maxSize) ? 0 : this.front + 1;
		this.nItems--;
		return old_item;
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i=0; i<nItems; i++) {
			int index = (this.front + i == maxSize) ? 0 : this.front + i;
			System.out.print(this.queueArray[index]+" ");
		}
		System.out.println("] this.front="+this.front+" this.rear="+this.rear);
	}
}
