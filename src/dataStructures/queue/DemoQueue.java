package dataStructures.queue;

public class DemoQueue {

	public static void main(String[] args) {
		
		Queue<String> demoQueue = new Queue<>();
		
		demoQueue.enqueue("Gradle");
		demoQueue.enqueue("Hadoop");
		demoQueue.enqueue("Initializr");
		demoQueue.enqueue("JUnit");
		demoQueue.enqueue("Kotlin");
		demoQueue.enqueue("Less");
		
		System.out.println(demoQueue.dequeue());
		System.out.println(demoQueue.dequeue());
		
		System.out.println(demoQueue);
	}

}
