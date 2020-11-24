package dataStructures.graph;

import java.util.*;

/**
 * This is a Graph example from the web.  See source below.
 * https://javabycode.com/dsa/graph-data-structure-in-java.html
 */
public class Graph {

    // We use Hashmap to store the edges in the graph
    // Hashmap keys are the vertices and values are the edges
    private Map<Integer, List<Integer>> map = new HashMap<>();

    // adds a new vertex to the graph
    public void addVertex(Integer vertex) {
        map.put(vertex, new LinkedList<Integer>());
    }

    // adds the edge of source and destination vertices
    public void addEdge(Integer sVertex, Integer dVertex) {

        if (!map.containsKey(sVertex))
            addVertex(sVertex);

        if (!map.containsKey(dVertex))
            addVertex(dVertex);

        map.get(sVertex).add(dVertex);
    }

    // get graph size
    public Integer size() {
        return map.keySet().size();
    }

    // return the count of edges
    public Integer getEdgesCount() {
        int count = 0;
        for (Integer v : map.keySet()) {
            count += map.get(v).size();
        }
        return count;
    }

    // Displays the adjacency list of each vertex.
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Integer v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (Integer w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}