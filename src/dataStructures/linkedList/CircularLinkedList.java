package dataStructures.linkedList;

/**
 * My attempt at implementing a circular linked list data structure as a way of learning about them.
 * This particular linked list stores any object type.
 * @author Tim Bucher
 *
 */
public class CircularLinkedList<T> extends LinkedList<T>
{
	/**
	 * A fluent method for adding data to the list.
	 * @param toAdd data to add to the end of the list
	 * @return This list with new data added and the tail set to reference the head
	 */
	@Override
	public CircularLinkedList<T> append(T toAdd)
	{
		super.append(toAdd);
		this.tail.next = this.head;  // Tail will always contain a reference to the head.
		return this;
	}
}
