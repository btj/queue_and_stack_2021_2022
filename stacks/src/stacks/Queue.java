package stacks;

import java.util.Arrays;

public class Queue extends Bag {
	
	/**
	 * @post | getElements().length == 0
	 */
	public Queue() {
		elements = new Object[0];
	}
	
	/**
	 * @post | old(getElements().length) != 0 || result == null
	 * @post | old(getElements().length) == 0 || getElements().length == old(getElements().length) - 1
	 * @post | old(getElements().length) == 0 || result == old(getElements()[0])
	 * @post | old(getElements().length) == 0 || Arrays.equals(getElements(), 0, getElements().length, old(getElements()), 1, getElements().length + 1)
	 */
	@Override
	public Object take() {
		if (elements.length == 0)
			return null;
		Object result = elements[0];
		Object[] newElements = new Object[elements.length - 1];
		System.arraycopy(elements, 1, newElements, 0, newElements.length);
		elements = newElements;
		return result;
	}

}
