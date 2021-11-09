package stacks;

import java.util.Arrays;

public class Stack extends Bag {
	
	/**
	 * @post | getElements().length == 0
	 */
	public Stack() {
		elements = new Object[0];
	}
	
	/**
	 * @pre | getElements().length != 0
	 * @post | getElements().length == old(getElements().length) - 1
	 * @post | result == old(getElements()[getElements().length - 1])
	 * @post | Arrays.equals(getElements(), 0, getElements().length, old(getElements()), 0, getElements().length)
	 */
	public Object take() {
		Object result = elements[elements.length - 1];
		Object[] newElements = new Object[elements.length - 1];
		System.arraycopy(elements, 0, newElements, 0, newElements.length);
		elements = newElements;
		return result;
	}

}
