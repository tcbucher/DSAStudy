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

        // edges are added.
        g.addEdge(10, 20);
        g.addEdge(10, 40);
        g.addEdge(20, 10);
        g.addEdge(20, 30);
        g.addEdge(30, 20);
        g.addEdge(30, 40);
        g.addEdge(40, 10);
        g.addEdge(40, 30);

        // print the graph.
        System.out.println("Here is the graph:\n" + g.toString());

        // print number of vertices in the graph.
        System.out.println("Number of vertices graph: "+g.size());

        // print number of edges in the graph.
        System.out.println("Number of edges graph: "+g.getEdgesCount());

    }
}