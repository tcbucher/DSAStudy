package dataStructures.linkedList;

/**
 * My attempt at implementing a linked list data structure as a way of learning about them.
 * This particular linked list stores any object type.
 * @author Tim Bucher
 *
 */
public class LinkedList<T> implements Iterator<T>
{
	Node head;
	Node tail;
	Node cursor;
	int size;

	/**
	 * A fluent method for adding data to the list.
	 * @param toAdd data to add to the end of the list
	 * @return This list with new data added
	 */
	public LinkedList<T> append(T toAdd)
	{
		Node newNode = new Node(toAdd);

		if(toAdd == null)
			throw new IllegalArgumentException("Will not accept null parameter");

		// If list is currently empty, set head and tail to the new node and return
		if (this.head == null)
		{
			this.head = this.tail = newNode;
			this.cursor = null;
			return this;
		}

		// If list is not empty, add the new node as the tail
		tail.next = newNode;
		tail =  newNode;

		size++;
		return this;

	}

	@Override
	public void reset()
	{
		this.cursor = this.head;
	}

	@Override
	public boolean hasNext()
	{
		return (cursor == null)? this.head != null : this.cursor.next != null;
	}

	@Override
	public T getNext()
	{
		if (!this.hasNext())
			throw new IndexOutOfBoundsException("Linked list does not contain a next item");

		cursor = (cursor == null)? this.head : cursor.next;
		return cursor.data;
	}

	public boolean isEmpty()
	{
		return this.head == null;
	}

	public int size()
	{
		return this.size;
	}
	
	private class Node
	{
		T data;
		Node next;
		
		private Node(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder("LinkedList {");

		Node node = this.head;
		while (node != null)
		{
			builder.append(node.data);
			builder.append((node.next == null)? "" : ", ");
			node = node.next;
		}

		return builder.append("}").toString();
		
	}
}
