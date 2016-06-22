package cs525.adapter;

/**
 * 
 * @author JIVAN
 * 
 *         Target2 Interface Queue
 *
 */
public interface Queue {

	public void enqueue(String str);

	public String dequeue();

	public boolean isEmpty();
}
