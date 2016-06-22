package cs525.adapter;

public class Adapter implements Stack, Queue {

	private Adaptee adaptee;
	
	public Adapter(){
		this.adaptee = new Adaptee();
	}

	@Override
	public void enqueue(String str) {
		adaptee.add(str);

	}

	@Override
	public String dequeue() {
		int start = adaptee.getStart();
		String data = adaptee.get(start);
		adaptee.remove(start);
		adaptee.setStart(++start);

		return data;
	}

	@Override
	public void push(String str) {
		adaptee.add(str);

	}

	@Override
	public String pop() {

		int end = adaptee.getEnd();
		String data = adaptee.get(end - 1);
		adaptee.remove(end);
		return data;

	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

}
