package cs525.labs.decorator;

import java.util.ArrayList;

/**
 * Client
 * @author OWNER
 *
 */
public class Client {

	public static void main(String[] args) {

		Profiler<Integer> arrayListProfiler = new ArrayListProfiler<>(new ArrayList<Integer>());
		Profiler<Integer> linkedListAndArrayListProfiler = new LinkedListProfiler<>(arrayListProfiler);

		linkedListAndArrayListProfiler.add(34);

		System.out.println();
		linkedListAndArrayListProfiler.contains(34);

		System.out.println();
		linkedListAndArrayListProfiler.remove(34);

		System.out.println();
		linkedListAndArrayListProfiler.size();

	}
}
