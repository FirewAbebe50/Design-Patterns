package cs525.labs.cor;

/**
 * 
 * Chain builder for COR
 * @author OWNER
 *
 */
public class ChainBuilder {

	private CallRecordAnalyzer analyzer;

	public ChainBuilder() {
		analyzer = new CallRecordValidator();
		CallRecordAnalyzer washer = new DataWasher();
		CallRecordAnalyzer reporter = new Reporter();
		analyzer.setNextAnalyzer(washer);
		washer.setNextAnalyzer(reporter);

	}
	
	public CallRecordAnalyzer getAnalyzer(){
		return this.analyzer;
	}
}
