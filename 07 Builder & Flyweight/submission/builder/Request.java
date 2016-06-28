package cs525.labs.builder;

/**
 * Participant: Product
 * 
 * @author OWNER
 *
 */
public class Request {

	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public Customer getRequester() {
		return requester;
	}

	public void setRequester(Customer requester) {
		this.requester = requester;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getReqContent() {
		return reqContent;
	}

	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}

	public String getRespContent() {
		return respContent;
	}

	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}

	public boolean isAnswered() {
		return isAnswered;
	}

	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}

	public boolean isSaleLead() {
		return isSaleLead;
	}

	public void setSaleLead(boolean isSaleLead) {
		this.isSaleLead = isSaleLead;
	}

	public boolean isNeedCallBack() {
		return needCallBack;
	}

	public void setNeedCallBack(boolean needCallBack) {
		this.needCallBack = needCallBack;
	}

	/**
	 * private String reqId; private Customer requester; private Agent agent;
	 * private String reqContent; private String respContent; private boolean
	 * isAnswered; private boolean isSaleLead; private boolean needCallBack;
	 */
	public String toString() {
		return "Request ID: " + reqId + "\n" + "Requester: " + requester + "\n" + "Agent Online: " + agent + "\n"
				+ "Request Content: " + reqContent + "\n" + "Response Content: " + respContent + "\n" + "Is Answered: "
				+ (isAnswered ? "YES" : "NO") + "\n" + "Is SaleLead: " + (isSaleLead ? "YES" : "NO") + "\n"
				+ "Need CallBack: " + (needCallBack ? "YES" : "NO");
	}

}
