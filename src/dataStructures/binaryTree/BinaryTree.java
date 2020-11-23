package dataStructures.binaryTree;

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
