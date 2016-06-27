package cs525.labs.cor;

/**
 * 
 * Abstract Handler
 * @author OWNER
 *
 */

public abstract class CallRecordAnalyzer {

	protected CallRecordAnalyzer nextAnalyzer;

	public void setNextAnalyzer(CallRecordAnalyzer next) {
		this.nextAnalyzer = next;
	}

	public abstract void analyzeCallRecord(CallRecord record);

}
