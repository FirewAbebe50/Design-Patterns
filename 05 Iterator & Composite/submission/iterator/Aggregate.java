package cs525.labs.iterator;

public interface Aggregate {

	public Iterator getIterator();

	public void add(String name);

	public void delete(String name);
}
