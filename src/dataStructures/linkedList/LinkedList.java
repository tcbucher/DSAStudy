package dataStructures.linkedList;

/**
 * My attempt at implementing a linked list data structure as a way of learning about them.
 * This particular linked list stores any object type.
 * @author Tim Bucher
 *
 */
public class LinkedList<T extends Object>
{
	Node head;
	
	// Create an add method
	public LinkedList add(LinkedList<T> list, T toAdd)
	{
		Node newNode = new Node(toAdd);
		
		// If list is null, will throw NPE, but for the sake of example, I don't care
		// Client code should pass in a LinkedList of T
		Node last = list.head;
		
		if (last == null)
		{
			list.head = newNode;
			return list;
		}
		
		while (last.next != null)
		{
			last = last.next;
		}
		
		last.next = newNode;
		
		return list;
		
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
		String value = "LinkedList:{";
		
		Node last = this.head;
		while (last != null && last.next != null)
		{
			value += last.data.getClass();
			value += ": ";
			value += last.next.toString();
			value += ",";
			value += System.lineSeparator();
			last = last.next;
		}
		
		return value + "}";
		
	}
}
