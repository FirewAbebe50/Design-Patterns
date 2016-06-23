package cs525.labs.factory;

public class TraceFactoryImpl implements TraceFactory {

	private static TraceFactoryImpl factory = null;

	private TraceFactoryImpl() {

	}

	public static TraceFactoryImpl getFactory() {
		synchronized (TraceFactoryImpl.class) {
			if (factory == null)
				factory = new TraceFactoryImpl();
		}
		return factory;
	}

	@Override
	public Trace createTrace(String type) {

		if (type.equals("trace.log"))
			return new FileTrace();
		else if (type.equals("console"))
			return new ConsoleTrace();

		return null;
	}

}
