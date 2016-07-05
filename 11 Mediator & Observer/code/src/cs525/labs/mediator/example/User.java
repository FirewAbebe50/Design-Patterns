package cs525.labs.mediator.example;

public abstract class User {

	private ChatRoomMediator mediator;
	private String name;

	public User(ChatRoomMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;

	}
	
	public abstract void send(String message);
	public abstract void receive(String message);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChatRoomMediator getMediator() {
		return mediator;
	}

	public void setMediator(ChatRoomMediator mediator) {
		this.mediator = mediator;
	}

	
	
}
