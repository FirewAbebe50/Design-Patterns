package cs525.labs.singleton;

//main class 
public class Main {

	public static void main(String[] args) {
		Singleton SingletonLazy = Singleton.getInstance();
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		
		//access method or simply, use - SingletonEnum.INSTANCE.behavior();
		singletonEnum.behavior();
	}

}
