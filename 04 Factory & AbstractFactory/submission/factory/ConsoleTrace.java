package cs525.labs.factory;

import java.util.Date;

// concrete product
public class ConsoleTrace implements Trace {
	boolean traceFlag = false;

	@Override
	public void setDebug(boolean debug) {

		traceFlag = debug;
	}

	@Override
	public void debug(String message) {
		
		//turn on or off based on trace flag for debug
		if(traceFlag)
			System.out.println("DEBUG: " + new Date() + " - " + message);

	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + new Date() + " - " + message);

	}

}
