package dataStructures.linkedList;

public class DemoLinkedList {

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		
		list = list.append("Apple")
				.append("Boeing")
				.append("Canon")
				.append("Deloitte")
				.append("Epson")
				.append("Facebook");
		
		System.out.println(list);

	}

}
