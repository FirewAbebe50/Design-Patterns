package cs525.labs.factory;

public class Client {

	public static void main(String[] args) {

		// factory
		TraceFactory tf = TraceFactoryImpl.getFactory();
		Trace trace = tf.createTrace("trace.log"); // console for ConsoleTrace,
													// trace.log for FileTrace
		trace.setDebug(true);
		trace.debug("Hello Debugger");
		trace.error("Debugger error");

	}

}
