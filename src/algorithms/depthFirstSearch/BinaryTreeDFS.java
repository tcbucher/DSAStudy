package algorithms.depthFirstSearch;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.stack.Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * An attempt at a DFS algorithm using my own BinaryTree implementation.
 * Also uses my Stack implementation.
 * Bear in mind this is my first attempt at this ever, so probably not optimal
 * @author Tim Bucher
 */
public class BinaryTreeDFS
{
    public static void main(String[] args)
    {
        List<BinaryTree<String>> visitedNodes = new ArrayList<>();
        Stack<BinaryTree<String>> searchNodes = new Stack<>();
        BinaryTree<String> currentNode = createBinaryTree(); // Set currentNode to root of tree we are searching
        String searchTerm = "O";

        while (true)
        {
            if (currentNode.getData().equals(searchTerm))
            {
                System.out.println(String.format("search term %s found", searchTerm));
                break;
            }
            if (visitedNodes.contains(currentNode.getLeft()) && visitedNodes.contains(currentNode.getRight())) // we have reached the capacity of the tree
                break;

            System.out.println("Visiting node containing " + currentNode.getData());
            if (!visitedNodes.contains(currentNode))
                visitedNodes.add(currentNode);

            if (currentNode.getLeft() != null && !visitedNodes.contains(currentNode.getLeft()))
            {
                System.out.println("going left");
                searchNodes.push(currentNode);
                currentNode = currentNode.getLeft();
                continue;
            }
            else if (currentNode.getRight() != null && !visitedNodes.contains(currentNode.getRight()))
            {
                System.out.println("going right");
                searchNodes.push(currentNode);
                currentNode = currentNode.getRight();
                continue;
            }
            else
            {
                System.out.println("backing up");
                currentNode = searchNodes.pop();
                continue;
            }
        }
    }



    private static BinaryTree<String> createBinaryTree()
    {
        BinaryTree<String> newTree = new BinaryTree<>();
        newTree.setData("G");
        newTree.addLeft("R").addLeft("E").addLeft("A").addLeft("T");
        newTree.addRight("O").addLeft("O").addLeft("D");
        newTree.getRight().addRight("L").addLeft("D");
        return newTree;
    }
}
