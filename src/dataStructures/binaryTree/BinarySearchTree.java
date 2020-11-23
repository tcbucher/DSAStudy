package dataStructures.binaryTree;

public class BinarySearchTree {

	private Integer data;
	private BinarySearchTree leftChild;
	private BinarySearchTree rightChild;
	
	public BinarySearchTree addLeft(Integer data)
	{
		if (data >= this.data)
		{
			throw new IllegalArgumentException("Binary Search Tree can only accept left child with value less than root");
		}
			
		BinarySearchTree newTree = new BinarySearchTree();
		newTree.data = data;
		this.leftChild = newTree;
		return this.leftChild;
	}
	
	public BinarySearchTree addRight(Integer data)
	{
		if (data <= this.data)
		{
			throw new IllegalArgumentException("Binary Search Tree can only accept right child with value greater than root");
		}
		
		BinarySearchTree newTree = new BinarySearchTree();
		newTree.data = data;
		this.rightChild = newTree;
		return this.rightChild;
	}

	public BinarySearchTree getLeft()
	{
		return this.leftChild;
	}
	
	public BinarySearchTree getRight()
	{
		return this.rightChild;
	}
}
