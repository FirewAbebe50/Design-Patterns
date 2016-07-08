package cs525.labs.mediator.example;

public class Client {

	public static void main(String[] args) {
		ChatRoomMediator mediator = new ChatRoomMediatorImpl();
		User u1 = new UserImpl(mediator, "Jivan");
		User u2 = new UserImpl(mediator, "Rajendra");
		User u3 = new UserImpl(mediator, "Sita");
		User u4 = new UserImpl(mediator, "Sabina");

		mediator.addUser(u1);
		mediator.addUser(u2);
		mediator.addUser(u3);
		mediator.addUser(u4);

		u1.send("Hello world");

	}

}
