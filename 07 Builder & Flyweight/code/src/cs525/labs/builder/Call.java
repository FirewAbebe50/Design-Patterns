package cs525.labs.builder;

import java.util.Date;

public class Call {

	private String requestId;
	private Agent agent;
	
	public void callPop(Agent agent){
		this.requestId = "" + (new Date()).getTime();
		this.agent = agent;
	}

	public String getRequestId() {
		return requestId;
	}

	public Agent getAgent() {
		return agent;
	}
	
	
}
