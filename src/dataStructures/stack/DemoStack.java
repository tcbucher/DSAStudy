package dataStructures.stack;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack<String> demoStack = new Stack<>();
		
		demoStack.push("Gradle");
		demoStack.push("Hadoop");
		demoStack.push("Initializr");
		demoStack.push("JUnit");
		demoStack.push("Kotlin");
		demoStack.push("Less");
		
		System.out.println(demoStack.pop());
		System.out.println(demoStack.peek());
		
		System.out.println(demoStack);
	}

}
