package algorithms.reverselinkedlist;

import dataStructures.linkedList.LinkedList;
import dataStructures.stack.Stack;

public class LinkedListReverser
{
    public static void main(String[] args) {

        LinkedList<Integer> forwardList = new LinkedList<>();
        forwardList.append(10);
        forwardList.append(20);
        forwardList.append(30);
        forwardList.append(40);
        forwardList.append(50);
        forwardList.append(60);
        forwardList.append(70);
        forwardList.append(80);
        forwardList.append(90);

        System.out.println(forwardList);

        LinkedList<Integer> reverseList = new LinkedListReverser().reverse(forwardList);

        System.out.println(reverseList);

    }

    private LinkedList<Integer> reverse(LinkedList<Integer> list)
    {
        LinkedList<Integer> reverseList = new LinkedList<>();

        // Add all of the list elements to a stack
        Stack<Integer> tempStack = new Stack<>();
        while(list.hasNext())
        {
            tempStack.push(list.getNext());
        }

        // pop that stack into a new list
        while(tempStack.peek() != null)
        {
            reverseList.append(tempStack.pop());
        }

        return reverseList;
    }

}
