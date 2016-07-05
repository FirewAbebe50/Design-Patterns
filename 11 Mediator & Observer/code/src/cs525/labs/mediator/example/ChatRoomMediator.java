package cs525.labs.mediator.example;

public abstract class ChatRoomMediator {

	public abstract void sendMessage(String message, User user);
	public abstract void addUser(User user);
}
