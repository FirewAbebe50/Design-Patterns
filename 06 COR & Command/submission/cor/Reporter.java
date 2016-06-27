package cs525.labs.cor;

/**
 * 
 * Concrete Handler
 * @author OWNER
 *
 */
public class Reporter extends CallRecordAnalyzer {

	@Override
	public void analyzeCallRecord(CallRecord record) {

		if (record.isASalesLead()) {
			System.out.println("__________ Sales Lead Report ___________");
			System.out.println(record);
		}
		else{
			//do something - pass to all-case handler
		}
	}

}
