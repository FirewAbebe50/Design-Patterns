package cs525.labs.builder;

/**
 * Participant: Director
 * @author OWNER
 *
 */
public class CallCenterManager {

	public RequestBuilder builder;

	public CallCenterManager(RequestBuilder builder) {
		this.builder = builder;
	}

	public void constructRequest(Agent agent, String phone, String requestContent, String responseContent,
			boolean isAnswered, boolean isSaleLead, boolean needCallback) {

		builder.buildAgentInfo(agent);
		builder.buildRequesterInfo(phone);
		builder.buildRequestContent(requestContent);
		builder.buildResponseContent(responseContent);
		builder.buildCallClosing(isAnswered, isSaleLead, needCallback);

	}

	public Request getRequest() {
		return builder.getRequest();
	}
}
