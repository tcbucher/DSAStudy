package dataStructures.graph;

/**
 * My attempt at implementing a graph data structure as a way of learning about them.
 * This particular graph stores any object type.
 * This is a work in progress and I may not end up implementing it at all.
 * @author Tim Bucher
 *
 */
public class GraphTCB<T extends Object>
{
	Vertex head;
	
	// Create an add method
	public GraphTCB add(GraphTCB<T> list, T toAdd)
	{
		Vertex newVertex = new Vertex(toAdd);
		
		// If list is null, will throw NPE, but for the sake of example, I don't care
		// Client code should pass in a Graph of T
		Vertex last = list.head;
		
		if (last == null)
		{
			list.head = newVertex;
			return list;
		}
		
		while (last.next != null)
		{
			last = last.next;
		}
		
		last.next = newVertex;
		
		return list;
		
	}
	
	private class Vertex
	{
		T data;
		Vertex next;
		
		private Vertex(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	@Override
	public String toString()
	{
		String value = "LinkedList:{";
		
		Vertex last = this.head;
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
