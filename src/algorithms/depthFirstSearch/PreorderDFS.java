package algorithms.depthFirstSearch;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.stack.Stack;

/**
 * An attempt at a preorder DFS algorithm using my own BinaryTree implementation
 * @author Tim Bucher
 */
public class PreorderDFS
{
    BinaryTree<String> tree = createBinaryTree();

    Stack<BinaryTree<String>> nodeStack = new Stack<>();

    while ()
    {

    }

    private BinaryTree<String> createBinaryTree()
    {
        BinaryTree<String> newTree = new BinaryTree<>();
        newTree.setData("G");
        newTree.addLeft("R").addLeft("E").addLeft("A").addLeft("T");
        newTree.addRight("O").addLeft("O").addLeft("D");
        newTree.getRight().addRight("L").addLeft("D");
        return newTree;
    }
}
