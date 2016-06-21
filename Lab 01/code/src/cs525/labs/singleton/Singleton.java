package cs525.labs.singleton;

//Traditional Implementation of Singleton Pattern
/**
 * @author JIVAN/ Returns a reference to the single instance. Creates the
 *         instance if it does not yet exist. (This is called lazy
 *         instantiation.)
 */
/**
 * Thread Safety: for thread-safe implementation, we can use synchronized
 * keyword in the method. But, it reduces the performance due to the cost
 * associated with the synchronized method. So, to avoid this extra overhead
 * every time, double checked locking principle is used. In this approach, the
 * synchronized block is used inside if condition with an additional check to
 * ensure that only one instance of singleton class is created.
 * 
 */
public class Singleton {
	private static Singleton uniqueInstance = null;
	private int data = 0;

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}

		return uniqueInstance;
	}

	/**
	 * The Singleton Constructor. Note that it is private! No client can
	 * instantiate a Singleton object directly!
	 */
	private Singleton() {
	}
	// Accessors and mutators here!
}