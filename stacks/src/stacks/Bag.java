package stacks;

import java.util.Arrays;

/**
 * @invar | getElements() != null
 */
public abstract class Bag {
	
	/**
	 * @representationObject
	 * @invar | elements != null
	 */
	protected Object[] elements;
	
	public Object[] getElements() { return elements.clone(); }
	
	/**
	 * @post | getElements().length == 0
	 */
	public Bag() {
		elements = new Object[0];
	}
	
	/**
	 * @post | getElements().length == old(getElements().length) + 1
	 * @post | Arrays.equals(getElements(), 0, getElements().length - 1, old(getElements()), 0, old(getElements()).length)
	 * @post | getElements()[getElements().length - 1] == element
	 */
	public void put(Object element) {
		Object[] newElements = new Object[elements.length + 1];
		System.arraycopy(elements, 0, newElements, 0, elements.length);
		newElements[elements.length] = element;
		elements = newElements;
	}

	/**
	 * @pre | getElements().length != 0
	 * @post | getElements().length == old(getElements().length) - 1
	 * @post | Arrays.stream(old(getElements())).anyMatch(e -> e == result)
	 * @post | Arrays.stream(getElements()).allMatch(e ->
	 *       |     Arrays.stream(getElements()).filter(e1 -> e1 == e).count() == (
	 *       |          Arrays.stream(old(getElements())).filter(e2 -> e2 == e).count() - (e == result ? 1 : 0)
	 *       |     )
	 *       | )
	 */
	public abstract Object take();

}
