package cs525.labs.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediatorImpl extends ChatRoomMediator {

	private List<User> users;

	public ChatRoomMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User collegaue : users)
			if (!user.equals(collegaue))
				collegaue.receive(message);

	}

	@Override
	public void addUser(User user) {
		users.add(user);

	}

}
