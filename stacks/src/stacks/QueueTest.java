package stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {
	
	void testQueue(Queue queue) {
		assertArrayEquals(new Object[] {}, queue.getElements());
		queue.put(10);
		assertArrayEquals(new Object[] {10}, queue.getElements());
		queue.put(20);
		assertArrayEquals(new Object[] {10, 20}, queue.getElements());
		assertEquals(10, queue.take());
		assertArrayEquals(new Object[] {20}, queue.getElements());
		assertEquals(20, queue.take());
		assertArrayEquals(new Object[] {}, queue.getElements());		
	}
	
	@Test
	void test() {
		testQueue(new Queue());
		BagTest.testBag(new Queue());
	}

}
