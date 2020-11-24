package dataStructures.binaryTree;

/**
 * My first attempt at creating a binary tree data structure.
 * This is essentially a bifurcating linked list, where each node is a binary tree with itself as the root.
 * Each node contains a payload of data and references to left and right child nodes.
 *
 * @author Tim Bucher
 * @param <T> Type of object to be stored in the binary tree
 */
public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public void setData(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public BinaryTree<T> addLeft(T data)
	{
		BinaryTree<T> newTree = new BinaryTree();
		newTree.setData(data);
		this.leftChild = newTree;
		return this.leftChild;
	}
	
	public BinaryTree<T> addRight(T data)
	{
		BinaryTree<T> newTree = new BinaryTree();
		newTree.setData(data);
		this.rightChild = newTree;
		return this.rightChild;
	}

	public BinaryTree<T> getLeft()
	{
		return this.leftChild;
	}
	
	public BinaryTree<T> getRight()
	{
		return this.rightChild;
	}

	@Override
	public String toString()
	{
		BinaryTree<T> obj = this;
		T myData = obj.getData();
		String retVal = myData.toString();
		return retVal;
	}
}
