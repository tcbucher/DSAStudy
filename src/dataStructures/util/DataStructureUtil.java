package dataStructures.util;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.graph.Graph;

public class DataStructureUtil
{
    public static BinaryTree<String> createStringTree()
    {
            BinaryTree<String> newTree = new BinaryTree<>();
            newTree.setData("G");
            newTree.addLeft("R").addLeft("E").addLeft("A").addLeft("T");
            newTree.addRight("O").addLeft("O").addLeft("N");
            newTree.getRight().addRight("L").addLeft("D");
            newTree.getRight().getRight().addRight("E").addRight("M");
            return newTree;
    }

    public static Graph<String> createStringGraph()
    {
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

        return graph;
    }
}
