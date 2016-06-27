package cs525.labs.cor;

/**
 * 
 * Concrete Handler
 * @author OWNER
 *
 */
public class DataWasher extends CallRecordAnalyzer {

	@Override
	public void analyzeCallRecord(CallRecord record) {

		if (record.isValid()) {
			record.setASalesLead(true);
			this.nextAnalyzer.analyzeCallRecord(record);
		}
		else{
			//do something
		}
	}

}
