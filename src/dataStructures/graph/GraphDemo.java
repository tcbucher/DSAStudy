package dataStructures.graph;

/**
 * This uses a Graph example from the web.  See source below.
 * https://javabycode.com/dsa/graph-data-structure-in-java.html
 */
public class GraphDemo
{
    public static void main(String args[]) {

        // create new graph instance
        Graph<String> graph = new Graph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","E");
        graph.addEdge("E","A");
        graph.addEdge("E","D");
        graph.addEdge("A","C");
        graph.addEdge("C","E");
        graph.addEdge("C","D");
        graph.addEdge("D","C");

        // print the graph.
        System.out.printf("Here is the graph: %s%n", graph);

        // print number of vertices in the graph.
        System.out.printf("Number of vertices: %s%n", graph.size());

        // print number of edges in the graph.
        System.out.printf("Number of edges: %s%n", graph.getEdgesCount());

    }
}