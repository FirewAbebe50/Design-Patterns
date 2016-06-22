package cs525.proxy.scenario1;

import java.util.Hashtable;

public class HashTableCloning {

	public  void doFetches(Hashtable htable){
		Hashtable copy = (Hashtable)htable.clone();
		// perform fetch operations in copy
	}
}
