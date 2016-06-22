package cs525.proxy.scenario1;

import java.util.Hashtable;

public class ObjectLocking {

	public  void doFetches(Hashtable htable){
		synchronized(htable){
			// perform fetch operations on htable
		}
	}
}
