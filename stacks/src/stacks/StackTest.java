package stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {
	
	static void testStack(Stack stack) {
		assertArrayEquals(new Object[] {}, stack.getElements());
		stack.put(10);
		assertArrayEquals(new Object[] {10}, stack.getElements());
		stack.put(20);
		assertArrayEquals(new Object[] {10, 20}, stack.getElements());
		assertEquals(20, stack.take());
		assertArrayEquals(new Object[] {10}, stack.getElements());
		assertEquals(10, stack.take());
		assertArrayEquals(new Object[] {}, stack.getElements());		
	}

	@Test
	void test() {
		testStack(new Stack());
		BagTest.testBag(new Stack());
	}

}
