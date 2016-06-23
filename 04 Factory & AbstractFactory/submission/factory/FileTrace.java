package cs525.labs.factory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

// concrete product
public class FileTrace implements Trace {
	boolean traceFlag = true;
	PrintWriter writer = null;

	public FileTrace() {
		try {
			writer = new PrintWriter(
					"trace_" + (new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date())) + ".log", "UTF-8");
			System.out.println("Refresh Project Directory to check log file after a while !!");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setDebug(boolean debug) {

		traceFlag = debug;

	}

	@Override
	public void debug(String message) {

		// turn on or off based on trace flag for debug
		if (traceFlag)
			writer.println("DEBUG: " + new Date() + " - " + message);
		writer.flush();
	}

	@Override
	public void error(String message) {

		writer.println("ERROR: " + new Date() + " - " + message);
		writer.flush();
	}

}
