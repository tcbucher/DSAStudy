package dataStructures.graph;

import java.util.*;

/**
 * This is a Graph example from the web.  See source below.
 * https://javabycode.com/dsa/graph-data-structure-in-java.html
 * I genericized it as it originally only stored Integers as the vertices
 */
public class Graph<T>
{
    // We use Hashmap to store the edges in the graph
    // Hashmap keys are the vertices and values are the edges
    private Map<T, List<T>> map = new HashMap<>();

    // adds a new vertex to the graph
    public void addVertex(T vertex) {
        map.put(vertex, new LinkedList<T>());
    }

    // adds the edge of source and destination vertices
    public void addEdge(T sVertex, T dVertex) {

        if (!map.containsKey(sVertex))
            addVertex(sVertex);

        if (!map.containsKey(dVertex))
            addVertex(dVertex);

        map.get(sVertex).add(dVertex);
    }

    // get graph size
    public int size() {
        return map.keySet().size();
    }

    // return the count of edges
    public int getEdgesCount() {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        return count;
    }

    // Displays the adjacency list of each vertex.
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T vertex : map.keySet())
        {
            builder.append(vertex).append(": ");

            for (T edge : map.get(vertex))
            {
                builder.append(edge).append(" ");
            }

            builder.append("\n");
        }
        return builder.toString();
    }
}