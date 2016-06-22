package cs525.proxy.scenario1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * 
 * When the proxy's clone() method is invoked, it returns a copy of the proxy
 * and both proxies refer to the same hash table. When one of the proxies
 * modifies the hash table, the hash table itself is cloned. The
 * ReferenceCounterTable class is used to let the proxies know they are
 * working with a shared hash table . This class keeps track of the number of
 * proxies using the shared hash table.
 *
 */

@SuppressWarnings("rawtypes")
public class LargeHashTable extends Hashtable {

	private static final long serialVersionUID = 1L;
	private ReferenceCounterTable referenceTable;

	public LargeHashTable() {
		referenceTable = new ReferenceCounterTable();
	}

	public Object get(Object key) {
		return referenceTable.get(key);
	}

	// Hashtable modification
	@SuppressWarnings("unchecked")
	public Object put(Object key, Object value) {
		copyOnWrite();
		return referenceTable.put(key, value);
	}

	// It is for copy-on-write operation so that if hashtable is being shared
	// then this method clones it.
	private void copyOnWrite() {
		if (referenceTable.getProxyCount() > 1) {
			synchronized (referenceTable) {
				referenceTable.removeProxy();
				try {
					referenceTable = (ReferenceCounterTable) referenceTable.clone();
				} catch (Throwable e) {
					referenceTable.addProxy();
				}
			}
		}
	}

	// returns a copy of this proxy that accesses the same hashtable.
	public synchronized Object clone() {
		Object copy = super.clone();
		referenceTable.addProxy();
		return copy;
	}

	public int size() {
		return referenceTable.size();
	}

	// it is for maintaining the reference counter
	private class ReferenceCounterTable extends Hashtable {

		private static final long serialVersionUID = 1L;
		private int proxyCounter = 1;

		public ReferenceCounterTable() {
			super();
		}

		// returns a copy of this object with proxyCounter set back to 1.
		@SuppressWarnings("unchecked")
		public synchronized Object clone() {
			ReferenceCounterTable copy = (ReferenceCounterTable) super.clone();
			Set<Object> entrySet = copy.entrySet();
			
			//Deep Copy
			for(Object entry : entrySet){
				Map.Entry e = (Map.Entry)entry;
				copy.put(e.getKey(), e.getValue());
			}
			
			copy.proxyCounter = 1;
			return copy;
		}

		synchronized int getProxyCount() {
			return proxyCounter;
		}

		synchronized void addProxy() {
			proxyCounter++;
		}

		synchronized void removeProxy() {
			proxyCounter--;
		}

	}
}
