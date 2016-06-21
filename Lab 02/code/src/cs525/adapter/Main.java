package cs525.adapter;

public class Main {

	public static void main(String[] args) {
		
		//2-way adapter that works both as a stack and a queue
		Stack stack = new Adapter();
		Queue queue = new Adapter();
		
		stack.push("First Item");
		stack.push("second item");
		
		System.out.println("Pop: " + stack.pop());
		
		queue.enqueue("first item");
		queue.enqueue("second item");
		
		System.out.println("Dequeue: " + queue.dequeue());
		
	}

}
