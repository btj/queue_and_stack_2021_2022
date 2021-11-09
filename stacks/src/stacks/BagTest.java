package stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class BagTest {
	
	static void testBag(Bag bag) {
		assertArrayEquals(new Object[] {}, bag.getElements());
		bag.put(10);
		assertArrayEquals(new Object[] {10}, bag.getElements());
		bag.put(20);
		assertArrayEquals(new Object[] {10, 20}, bag.getElements());
		Object result1 = bag.take();
		assertTrue(result1 == (Object)10 || result1 == (Object)20);
		Object result2 = bag.take();
		assertEquals(Set.of(result1, result2), Set.of(10, 20));
		assertArrayEquals(new Object[] {}, bag.getElements());		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
