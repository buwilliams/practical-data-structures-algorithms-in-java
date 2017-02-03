package ds.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void insert_one_item() {
		Queue myQueue = new Queue(1);
		myQueue.insert(1);
		assertEquals(0, myQueue.front);
		assertEquals(0, myQueue.rear);
		assertEquals(1, myQueue.nItems);
	}
	
	@Test
	public void insert_one_then_remove_one_item() {
		Queue myQueue = new Queue(1);
		myQueue.insert(1);
		long myItem = myQueue.remove();
		assertEquals(1, myItem);
		assertEquals(0, myQueue.front);
		assertEquals(0, myQueue.rear);
		assertEquals(0, myQueue.nItems);
	}
	
	@Test
	public void insert_three_items_on_one() {
		Queue myQueue = new Queue(1);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		assertEquals(3, myQueue.queueArray[myQueue.front]);
		assertEquals(0, myQueue.front);
		assertEquals(0, myQueue.rear);
		assertEquals(1, myQueue.nItems);
	}
	
	@Test
	public void insert_one_then_remove_two_items() {
		Queue myQueue = new Queue(1);
		myQueue.insert(1);
		myQueue.remove();
		myQueue.remove();
		assertEquals(0, myQueue.front);
		assertEquals(0, myQueue.rear);
		assertEquals(0, myQueue.nItems);
	}
	
	
	@Test
	public void insert_two_items() {
		Queue myQueue = new Queue(2);
		myQueue.insert(1);
		myQueue.insert(2);
		assertEquals(0, myQueue.front);
		assertEquals(1, myQueue.rear);
		assertEquals(2, myQueue.nItems);
	}
	
	
	@Test
	public void insert_three_items_on_two() {
		Queue myQueue = new Queue(2);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		assertEquals(1, myQueue.front);
		assertEquals(0, myQueue.rear);
		assertEquals(2, myQueue.queueArray[myQueue.front]);
		assertEquals(3, myQueue.queueArray[myQueue.rear]);
		assertEquals(2, myQueue.nItems);
	}
	
	@Test
	public void insert_four_items_on_two() {
		Queue myQueue = new Queue(2);
		myQueue.insert(1); // 0, 0
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		assertEquals(0, myQueue.front);
		assertEquals(1, myQueue.rear);
		assertEquals(2, myQueue.nItems);
	}

}
