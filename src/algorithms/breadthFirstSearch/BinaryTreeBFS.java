package algorithms.breadthFirstSearch;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.queue.Queue;
import dataStructures.util.DataStructureUtil;

/**
 * This is my first attempt at implementing a BFS algorithm on a binary tree.
 * @author Tim Bucher
 */
public class BinaryTreeBFS
{
    public static void main(String[] args)
    {
        BinaryTree<String> tree = DataStructureUtil.createStringTree();
        Queue<BinaryTree<String>> searchQueue = new Queue<>();
        String searchTerm = "R";

        boolean stillLooking = true;
        int iterations = 0;

        searchQueue.enqueue(tree);

        do
        {
            iterations++;
            if (searchQueue.front().getLeft() != null)
            {
                searchQueue.enqueue(searchQueue.front().getLeft());
            }

            if (searchQueue.front().getRight() != null)
            {
                searchQueue.enqueue(searchQueue.front().getRight());
            }
        } while((stillLooking = !searchTerm.equals(searchQueue.dequeue().getData()))  && !searchQueue.isEmpty());

        String message = stillLooking? "Search term not found": String.format("Congratulations! Search term found was found after %s iterations!", iterations);
        System.out.println(message);
    }
}