package dataStructures.binaryTree;

public class BinaryTreeTestUtil
{
    public static BinaryTree<String> createStringTree()
    {
            BinaryTree<String> newTree = new BinaryTree<>();
            newTree.setData("G");
            newTree.addLeft("R").addLeft("E").addLeft("A").addLeft("T");
            newTree.addRight("O").addLeft("O").addLeft("D");
            newTree.getRight().addRight("L").addLeft("D");
            newTree.getRight().getRight().addRight("E").addRight("M");
            return newTree;
        }
}
