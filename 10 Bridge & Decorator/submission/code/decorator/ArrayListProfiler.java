package cs525.labs.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Concrete Decorator 1
 * @author OWNER
 *
 * @param <T>
 */
public class ArrayListProfiler<T> extends Profiler<T> {

	private List<T> list = new ArrayList<>();

	public ArrayListProfiler(List<T> profile) {
		super(profile);

	}

	@Override
	public boolean add(T e) {

		boolean val = super.add(e);
		long startTime = System.currentTimeMillis();
		val = list.add(e);
		long endTime = System.currentTimeMillis();
		System.out.print("ArrayList: boolean add(E e) - " + (endTime - startTime) + " milliseconds  ");

		return val;
	}

	@Override
	public boolean contains(Object o) {

		boolean val = super.contains(o);
		long startTime = System.currentTimeMillis();
		val = list.contains(o);
		long endTime = System.currentTimeMillis();
		System.out.print("ArrayList: boolean contains(Object o) - " + (endTime - startTime) + " milliseconds ");

		return val;

	}

	@Override
	public boolean remove(Object o) {
		boolean val = super.remove(o);
		long startTime = System.currentTimeMillis();
		val = list.remove(o);
		long endTime = System.currentTimeMillis();
		System.out.print("ArrayList: boolean remove(Object o) - " + (endTime - startTime) + " milliseconds ");

		return val;
	}

	@Override
	public int size() {

		int val = super.size();
		long startTime = System.currentTimeMillis();
		val = list.size();
		long endTime = System.currentTimeMillis();
		System.out.print("ArrayList: int size() - " + (endTime - startTime) + " milliseconds ");

		return val;
	}
}
