package cs525.labs.cor;

public class Agent {

	private String agentId;
	private Address workLocation;

	public Agent(){}
	
	public Agent(String id, Address work){
		this.setAgentId(id);
		this.setWorkLocation(work);
		
	}
	
	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}

	public String toString() {

		return "\n\tAgent: \n\t\tID: " + agentId + "\n\t\tWork Location: " + workLocation;
	}

}
