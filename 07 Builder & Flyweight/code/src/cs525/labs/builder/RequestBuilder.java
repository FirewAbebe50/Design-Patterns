package cs525.labs.builder;

/**
 * 
 * Participant: builder interface
 * @author OWNER
 *
 */
public interface RequestBuilder {

	void buildAgentInfo(Agent agent);

	void buildRequesterInfo(String phone);

	void buildRequestContent(String requestContent);

	void buildResponseContent(String responseContent);

	void buildCallClosing(boolean isAnswered, boolean isSaleLead, boolean needCallback);
	
	Request getRequest();
}
