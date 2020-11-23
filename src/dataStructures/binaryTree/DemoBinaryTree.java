package dataStructures.binaryTree;

public class DemoBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree<String> demoBT = new BinaryTree<>();
		
		demoBT.setData("G");
		demoBT.addLeft("R").addLeft("E").addLeft("A").addLeft("T");
		demoBT.addRight("O").addLeft("O").addLeft("D");
		demoBT.getRight().addRight("L").addLeft("D");
		
		System.out.println(demoBT.getData());
		
		// Traverse left side of tree
		BinaryTree<String> left = demoBT.getLeft();
		while(left != null)
		{
			System.out.println(left);
			left = left.getLeft();
		}
		
		// Spell out GOLD
		StringBuilder message = new StringBuilder(demoBT.getData().toString());
		message.append(demoBT.getLeft().getData().toString());
		
	}

}
