package cs525.labs.decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Concrete Decorator 2
 * @author OWNER
 *
 * @param <T>
 */
public class LinkedListProfiler<T> extends Profiler<T> {

	private List<T> list = new LinkedList<>();

	public LinkedListProfiler(List<T> profile) {
		super(profile);

	}

	@Override
	public boolean add(T e) {

		boolean val = super.add(e);
		long startTime = System.currentTimeMillis();
		val = list.add(e);
		long endTime = System.currentTimeMillis();
		System.out.print("LinkedList: boolean add(E e) - " + (endTime - startTime) + " milliseconds ");

		return val;
	}

	@Override
	public boolean contains(Object o) {

		boolean val = super.contains(o);
		long startTime = System.currentTimeMillis();
		val = list.contains(o);
		long endTime = System.currentTimeMillis();
		System.out.print("LinkedList: boolean contains(Object o) - " + (endTime - startTime) + " milliseconds ");

		return val;

	}

	@Override
	public boolean remove(Object o) {
		boolean val = super.remove(o);
		long startTime = System.currentTimeMillis();
		val = list.remove(o);
		long endTime = System.currentTimeMillis();
		System.out.print("LinkedList: boolean remove(Object o) - " + (endTime - startTime) + " milliseconds ");

		return val;
	}

	@Override
	public int size() {

		int val = super.size();
		long startTime = System.currentTimeMillis();
		val = list.size();
		long endTime = System.currentTimeMillis();
		System.out.print("LinkedList: int size() - " + (endTime - startTime) + " milliseconds ");

		return val;
	}

}
