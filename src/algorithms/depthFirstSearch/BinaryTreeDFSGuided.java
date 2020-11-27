package algorithms.depthFirstSearch;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.util.DataStructureUtil;
import dataStructures.stack.Stack;

/**
 * This is a guided approach to implemeting DFS on a BT using the methods described here
 * https://www.edureka.co/blog/java-binary-tree
 * @author Tim Bucher
 */
public class BinaryTreeDFSGuided
{
    public static void main(String[] args)
    {
        BinaryTree<String> currentNode = DataStructureUtil.createStringTree();
        Stack<String> inOrderStack = inOrderDFS(currentNode);

        String searchTerm = "A";
        System.out.println(inOrderStack);
        while(inOrderStack.size() > 0)
        {
            if (inOrderStack.pop().equals(searchTerm))
            {
                System.out.println(String.format("Found search term %s", searchTerm));
                break;
            }
        }

        if (inOrderStack.size() == 0)
        {
            System.out.println(String.format("Could not find search term %s", searchTerm));
        }

    }

    private static Stack<String> inOrderDFS(BinaryTree<String> node)
    {
        Stack<String> treeAsStack = new Stack<>();
        buildInOrderStack(node, treeAsStack);
        return treeAsStack;
    }

    private static void buildInOrderStack(BinaryTree<String> node, Stack<String> stack)
    {
        if (node != null)
        {
            buildInOrderStack(node.getLeft(), stack);
            stack.push(node.getData());
            buildInOrderStack(node.getRight(), stack);
        }
    }
}
