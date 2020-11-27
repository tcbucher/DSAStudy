package dataStructures.graph;

/**
 * This uses a Graph example from the web.  See source below.
 * https://javabycode.com/dsa/graph-data-structure-in-java.html
 */
public class DemoGraph
{
    public static void main(String args[]) {

        // create new graph instance
        Graph g = new Graph();

        // print the graph.
        System.out.println(String.format("Here is the graph: %s",g.toString()));

        // print number of vertices in the graph.
        System.out.println("Number of vertices graph: "+g.getVertexCount());

        // print number of edges in the graph.
        System.out.println("Number of edges graph: "+g.getEdgeCount());

    }
}