package cs525.labs.cor;

/**
 * 
 * Concrete Handler : Validator - it handles the record one by one
 * 
 * @author OWNER
 *
 */
public class CallRecordValidator extends CallRecordAnalyzer {

	
	
	@Override
	public void analyzeCallRecord(CallRecord record) {

		if (isRecordValid(record)) {

			// do some analysis tasks
			record.setValid(true);
			this.nextAnalyzer.analyzeCallRecord(record);

		} else {

			record.setValid(false);
			// save the record in 'discarded-record' file
		}

	}

	private boolean isRecordValid(CallRecord record) {

		return record.getCustomer().isValid();
	}

}
