package cs525.labs.cor;

/**
 * Client Program to test the COR
 * @author OWNER
 *
 */
public class Client {

	public static void main(String[] args) {

		ChainBuilder chainBuilder = new ChainBuilder();

		Address addr = new Address("1000 N. 4th Street", "Fairfield", "Iowa", "52557");
		Address work = new Address("1002 N. 10th Street", "IowaCity", "Iowa", "52556");

		Agent agent = new Agent("Agent568585", work);
		Customer customer = new Customer("Mark", "Twain", addr, "458-895-2658", "info@email.com");

		CallRecord record = new CallRecord(customer, agent, "This is the informatin requested by the customer");

		chainBuilder.getAnalyzer().analyzeCallRecord(record);

	}
}
