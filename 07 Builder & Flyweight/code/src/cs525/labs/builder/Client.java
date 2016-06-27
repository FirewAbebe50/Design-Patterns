package cs525.labs.builder;

public class Client {

	public static void main(String[] args) {

		Address work = new Address("1002 N. 10th Street", "IowaCity", "Iowa", "52556");

		Agent agent = new Agent("Agent568585", work);
		CallCenterManager manager = new CallCenterManager(new CallCenterRequestBuilder());
		manager.constructRequest(agent, "452-568-5899", "A Request Message from Customer",
				"A Response Message from Agent", true, true, false);

		Request request = manager.getRequest();
		System.out.println(request);
	}
}
