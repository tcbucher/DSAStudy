package dataStructures.graph;

import dataStructures.util.DataStructureUtil;

/**
 * This uses a Graph example from the web.  See source below.
 * https://javabycode.com/dsa/graph-data-structure-in-java.html
 */
public class GraphDemo
{
    public static void main(String[] args) {

        // create new graph instance
        Graph<String> graph = DataStructureUtil.createStringGraph();

        // print the graph.
        System.out.printf("Here is the graph: %s%n", graph);

        // print number of vertices in the graph.
        System.out.printf("Number of vertices: %s%n", graph.size());

        // print number of edges in the graph.
        System.out.printf("Number of edges: %s%n", graph.getEdgesCount());

    }
}