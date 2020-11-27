package dataStructures.graph;

/**
 * My attempt at implementing a graph data structure as a way of learning about them.
 * This particular graph stores any object type.
 * This is a work in progress and may not be optimal
 * @author Tim Bucher
 *
 */
public class Graph<T>
{
	Vertex head;
	int vertexCount;
	int edgeCount;
	
	public class Vertex
	{

		T data;
		Vertex[] connections;
		boolean visited;
		private Vertex(T data)
		{
			this.data = data;
			this.connections = null;
		}

		public Vertex connect(Vertex toVertex)
		{
			return toVertex;
		}
	}

	public int getVertexCount()
	{
		return this.vertexCount;
	}

	public int getEdgeCount()
	{
		return this.edgeCount;
	}
	
	@Override
	public String toString()
	{
		//TODO: Implement a toString
		return "Implement toString in Graph";
	}
}
