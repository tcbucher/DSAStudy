package algorithms.reverselinkedlist;

import dataStructures.linkedList.LinkedList;
import dataStructures.stack.Stack;

public class LinkedListReverser
{
    public static void main(String[] args) {

        LinkedList<Integer> forwardList = new LinkedList<>();
        forwardList.add(forwardList, 10);
        forwardList.add(forwardList, 20);
        forwardList.add(forwardList, 30);
        forwardList.add(forwardList, 40);
        forwardList.add(forwardList, 50);
        forwardList.add(forwardList, 60);
        forwardList.add(forwardList, 70);
        forwardList.add(forwardList, 80);
        forwardList.add(forwardList, 90);

        LinkedList<Integer> reverseList = new LinkedListReverser().reverse(forwardList);

    }

    private LinkedList<Integer> reverse(LinkedList<Integer> list)
    {
        LinkedList<Integer> reverseList = new LinkedList<>();
        Stack tempStack = new Stack<Integer>();

        //TODO: Figure out how to make my linked list iterable and use a foreach
        // todo: make this recursive
        for (int i = 0; i < list.size(); i++)
        {
            // TODO: add getter to linkedlist to get a node;';'op[l
//            tempStack.push(list.getnext());
        }


        return reverseList;
    }

}
