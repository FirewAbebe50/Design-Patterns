package cs525.labs.mediator;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		System.out.println("==========================================================");
		System.out.println("==================== REVERSI BOARD GAME ==================");
		System.out.println("===================Input: 3,2,black ======================");

		BoardMediator board = new BoardMediatorImpl();
		User user1 = new UserImpl(board, "Jivan");
		User user2 = new UserImpl(board, "Bob");

		board.addUser(user1);
		board.addUser(user2);

		System.out.println("Initial Positions of balls");
		System.out.println(board);

		Ball pass1 = new Ball(new Position(3, 5), Color.BLACK);
		user1.place(pass1);

		Ball pass2 = new Ball(new Position(2, 3), Color.WHITE);
		user2.place(pass2);

		int turn = 1;

		Scanner scanner = new Scanner(System.in);
		String readString = scanner.nextLine();
		while (readString != null) {
			System.out.println(readString);
			if (!readString.isEmpty()) {
				String[] values = readString.split(",");
				if (values.length > 2) {
					int x = Integer.parseInt(values[0]);
					int y = Integer.parseInt(values[1]);

					Color color = Color.BLACK;

					if (values[2].equals("white"))
						color = Color.WHITE;

					pass1 = new Ball(new Position(x, y), color);

					if (turn == 1) {
						user1.place(pass1);
					} else {

						user2.place(pass1);
						turn = 2;
					}

				}
			}

			if (scanner.hasNextLine()) {
				readString = scanner.nextLine();
			} else {
				readString = null;
			}
		}
	}
}
