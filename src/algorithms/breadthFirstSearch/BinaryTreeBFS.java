package algorithms.breadthFirstSearch;

import dataStructures.binaryTree.BinaryTree;
import dataStructures.queue.Queue;
import dataStructures.util.DataStructureUtil;

public class BinaryTreeBFS
{
    public static void main(String[] args)
    {
        BinaryTree<String> tree = DataStructureUtil.createStringTree();
        Queue<BinaryTree<String>> searchQueue = new Queue<>();
        String searchTerm = "N", head = null;

        searchQueue.enqueue(tree);

        while(!searchTerm.equals(head))
        {
            if (searchQueue.front().getLeft() != null)
            {
                searchQueue.enqueue(searchQueue.front().getLeft());
            }

            if (searchQueue.front().getRight() != null)
            {
                searchQueue.enqueue(searchQueue.front().getRight());
            }

            System.out.println(searchQueue);
            head = searchQueue.dequeue().getData();
        }
    }
}
