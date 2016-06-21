package cs525.labs.singleton;

/**
 * 
 * @author Jivan/ Description: Thread safe implementation of singleton pattern.
 *         As Java ensures that any Enum value is instantiated only once in a
 *         Java program - it will guarantee the single instance. Also, Java Enum
 *         values are globally accessible, so is the singleton. This kind of
 *         implementation for singleton is eager.
 *
 */
//Enum Implemenation for singleton
public enum SingletonEnum {
	INSTANCE;

	public static void behavior() {

		//Do something!
	}

}
