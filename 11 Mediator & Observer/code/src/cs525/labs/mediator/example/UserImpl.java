package cs525.labs.mediator.example;

public class UserImpl extends User{

	public UserImpl(ChatRoomMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println("Sending message by: " + super.getName() + " with content: " + message);
		super.getMediator().sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		System.out.println("Message received by " + this.getName() + " with content: " + message);
		
		
	}

}
