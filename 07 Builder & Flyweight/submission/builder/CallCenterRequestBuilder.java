package cs525.labs.builder;

/**
 * Participant: Concrete Builder
 * @author OWNER
 *
 */
public class CallCenterRequestBuilder implements RequestBuilder {

	private Request request;

	public CallCenterRequestBuilder() {

		request = new Request();
	}

	@Override
	public void buildAgentInfo(Agent agent) {

		Call call = new Call();
		call.callPop(agent);
		
		request.setReqId(call.getRequestId());
		request.setAgent(call.getAgent());
	}

	@Override
	public void buildRequesterInfo(String phone) {

		// if phone exists - then get customer info from db
		// else create new customer

		// for simulation purpose, we use following customer object
		Address addr = new Address("1000 N. 4th Street", "Fairfield", "Iowa", "52557");
		Customer customer = new Customer("Mark", "Twain", addr, "458-895-2658", "info@email.com");
		
		request.setRequester(customer);

	}

	@Override
	public void buildRequestContent(String requestContent) {
		
		this.request.setReqContent(requestContent);

	}

	@Override
	public void buildResponseContent(String responseContent) {
		
		this.request.setRespContent(responseContent + ". Thank you for doing business with us!");

	}

	@Override
	public void buildCallClosing(boolean isAnswered, boolean isSaleLead, boolean needCallback) {
		
		this.request.setAnswered(isAnswered);
		this.request.setNeedCallBack(needCallback);
		this.request.setSaleLead(isSaleLead);

	}

	@Override
	public Request getRequest() {
		return this.request;
	}

}
