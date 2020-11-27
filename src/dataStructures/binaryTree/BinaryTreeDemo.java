package dataStructures.binaryTree;

import dataStructures.util.DataStructureUtil;

public class BinaryTreeDemo
{

	public static void main(String[] args) {
		
		BinaryTree<String> demoBT = DataStructureUtil.createStringTree();
		
		System.out.println(demoBT.getData());
		
		// Traverse left side of tree
		BinaryTree<String> left = demoBT.getLeft();
		while(left != null)
		{
			System.out.println(left);
			left = left.getLeft();
		}
		
		// Spell out GOLD
		String message = demoBT.getData();
		message += demoBT.getLeft().getData();

		System.out.println(message);
		
	}

}
