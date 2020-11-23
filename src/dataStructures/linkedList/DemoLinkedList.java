package dataStructures.linkedList;

public class DemoLinkedList {

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		
		list = list.add(list, "Apple");
		list = list.add(list, "Boeing");
		list = list.add(list, "Canon");
		list = list.add(list, "Deloitte");
		list = list.add(list, "Epson");
		list = list.add(list, "Facebook");
		
		System.out.println(list);

	}

}
