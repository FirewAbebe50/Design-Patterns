package cs525.labs.mediator;

import java.util.ArrayList;
import java.util.List;

public class BoardMediatorImpl extends BoardMediator {

	private static final int BOARD_SIZE = 8;
	private List<User> users;
	private Ball[][] board;
	private String validMoves = "";

	public BoardMediatorImpl() {
		this.users = new ArrayList<>();
		this.board = new Ball[BOARD_SIZE][BOARD_SIZE];

		setupBoard();
	}

	private void setupBoard() {

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = new Ball(new Position(i, j), Color.NOCLR);
			}
		}

		board[3][3] = new Ball(new Position(3, 3), Color.BLACK);
		board[3][4] = new Ball(new Position(3, 4), Color.WHITE);
		board[4][3] = new Ball(new Position(4, 3), Color.WHITE);
		board[4][4] = new Ball(new Position(4, 4), Color.BLACK);
	}

	@Override
	public void placeBall(Ball ball, User user) {

		if (!isGameOver()) {
			if (isValidPosition(ball)) {
				board[ball.getPosition().getX()][ball.getPosition().getY()] = ball;
				ReverseColors(ball);
				System.out.println(displayBoard());
				for (User colleague : users)
					if (!colleague.equals(user))
						colleague.receiveTurn();

			} else {
				System.out.println(
						"The Ball " + ball + " is not in valid position - please, try again with different position!");
			}
		} else {
			printResult();
		}

	}

	@Override
	public void addUser(User user) {
		if (users.size() < 2) {
			users.add(user);
		} else {
			System.out.println("You are not allowed to add more than " + users.size() + " uses!");
		}

	}

	private boolean isValidPosition(Ball ball) {

		int x = ball.getPosition().getX();
		int y = ball.getPosition().getY();
		Color color = ball.getColor();
		boolean isValid = false;

		// horizontal move check
		// first half
		if ((y - 1) >= 0 && !board[x][y - 1].getColor().equals(color)
				&& !board[x][y - 1].getColor().equals(Color.NOCLR)) {

			for (int j = y - 2; j >= 0; j--) {
				if (board[x][j].getColor().equals(Color.NOCLR))
					break;
				else if (board[x][j].getColor().equals(color)) {
					validMoves += "hori_first, ";
					isValid = true;
					break;
				}
			}
		}

		// second half
		if ((y + 1) < BOARD_SIZE && !board[x][y + 1].getColor().equals(color)
				&& !board[x][y + 1].getColor().equals(Color.NOCLR)) {
			for (int j = y + 2; j < BOARD_SIZE; j++) {
				if (board[x][j].getColor().equals(Color.NOCLR))
					break;
				else if (board[x][j].getColor().equals(color)) {
					validMoves += "hori_second, ";
					isValid = true;
					break;
				}
			}
		}

		// vertical move check
		// first half
		if ((x - 1) >= 0 && !board[x - 1][y].getColor().equals(color)
				&& !board[x - 1][y].getColor().equals(Color.NOCLR)) {
			for (int i = x - 2; i >= 0; i--) {
				if (board[i][y].getColor().equals(Color.NOCLR))
					break;
				else if (board[i][y].getColor().equals(color)) {
					validMoves += "vert_first, ";
					isValid = true;
					break;
				}
			}
		}
		// second half
		if ((x + 1) < BOARD_SIZE && !board[x + 1][y].getColor().equals(color)
				&& !board[x + 1][y].getColor().equals(Color.NOCLR)) {
			for (int i = x + 2; i < BOARD_SIZE; i++) {
				if (board[i][y].getColor().equals(Color.NOCLR))
					break;
				else if (board[i][y].getColor().equals(color)) {
					validMoves += "vert_second, ";
					isValid = true;
					break;
				}
			}
		}

		// principal diagonal valid move check
		// first half
		if ((x - 1) >= 0 && (y - 1) >= 0 && !board[x - 1][y - 1].getColor().equals(color)
				&& !board[x - 1][y - 1].getColor().equals(Color.NOCLR)) {
			for (int i = 2; (x - i) >= 0 && (y - i) >= 0; i++) {
				if (board[x - i][y - i].getColor().equals(Color.NOCLR))
					break;
				else if (board[x - i][y - i].getColor().equals(color)) {
					validMoves += "pdiag_first, ";
					isValid = true;
					break;
				}
			}
		}

		// second half
		if ((x + 1) < BOARD_SIZE && (y + 1) < BOARD_SIZE && !board[x + 1][y + 1].getColor().equals(color)
				&& !board[x + 1][y + 1].getColor().equals(Color.NOCLR)) {
			for (int i = 2; (x + i) < BOARD_SIZE && (y + i) < BOARD_SIZE; i++) {
				if (board[x + i][y + i].getColor().equals(Color.NOCLR))
					break;
				else if (board[x + i][y + i].getColor().equals(color)) {
					validMoves += "pdiag_second, ";
					isValid = true;
					break;
				}
			}
		}

		// minor diagonal valid move check
		// first half
		if ((x + 1) < BOARD_SIZE && (y - 1) >= 0 && !board[x + 1][y - 1].getColor().equals(color)
				&& !board[x + 1][y - 1].getColor().equals(Color.NOCLR)) {
			for (int i = 2; (x + i) < BOARD_SIZE && (y - i) >= 0; i++) {
				if (board[x + i][y - i].getColor().equals(Color.NOCLR))
					break;
				else if (board[x + i][y - i].getColor().equals(color)) {
					validMoves += "mdiag_first, ";
					isValid = true;
					break;
				}
			}
		}

		// second half
		if ((x - 1) >= 0 && (y + 1) < BOARD_SIZE && !board[x - 1][y + 1].getColor().equals(color)
				&& !board[x - 1][y + 1].getColor().equals(Color.NOCLR)) {
			for (int i = 2; (x - i) >= 0 && (y + i) < BOARD_SIZE; i++) {
				if (board[x - i][y + i].getColor().equals(Color.NOCLR))
					break;
				else if (board[x - i][y + i].getColor().equals(color)) {
					validMoves += "mdiag_second, ";
					isValid = true;
					break;
				}
			}
		}

		return isValid;
	}

	private void ReverseColors(Ball ball) {

		int x = ball.getPosition().getX();
		int y = ball.getPosition().getY();
		Color color = ball.getColor();

		// horizontal move check
		// first half
		if (validMoves.contains("hori_first")) {

			for (int j = y - 1; j >= 0 && !board[x][j].getColor().equals(color); j--) {
				board[x][j].setColor(color);
				System.out.println("Color reversed for " + board[x][j]);
			}
		}

		// second half

		if (validMoves.contains("hori_second")) {

			for (int j = y + 1; j < BOARD_SIZE && !board[x][j].getColor().equals(color); j++) {
				board[x][j].setColor(color);
				System.out.println("Color reversed for " + board[x][j]);
			}
		}

		// vertical move check
		// first half
		if (validMoves.contains("vert_first")) {

			for (int j = x - 1; j >= 0 && !board[j][y].getColor().equals(color); j--) {
				board[j][y].setColor(color);
				System.out.println("Color reversed for " + board[j][y]);
			}
		}
		// second half
		if (validMoves.contains("vert_second")) {

			for (int j = x + 1; j < BOARD_SIZE && !board[j][y].getColor().equals(color); j++) {
				board[j][y].setColor(color);
				System.out.println("Color reversed for " + board[j][y]);
			}
		}

		// principal diagonal valid move check
		// first half
		if (validMoves.contains("pdiag_first")) {

			for (int j = 1; (x - j) >= 0 && (y - j) >= 0 && !board[x - j][y - j].getColor().equals(color); j++) {
				board[x - j][y - j].setColor(color);
				System.out.println("Color reversed for " + board[x - j][y - j]);
			}
		}

		// second half
		if (validMoves.contains("pdiag_second")) {

			for (int j = 1; (x + j) < BOARD_SIZE && (y + j) < BOARD_SIZE
					&& !board[x + j][y + j].getColor().equals(color); j++) {
				board[x + j][y + j].setColor(color);
				System.out.println("Color reversed for " + board[x + j][y + j]);
			}
		}
		// minor diagonal valid move check
		// first half
		if (validMoves.contains("mdiag_first")) {

			for (int j = 1; (x + j) < BOARD_SIZE && (y - j) >= 0
					&& !board[x + j][y - j].getColor().equals(color); j++) {
				board[x + j][y - j].setColor(color);
				System.out.println("Color reversed for " + board[x + j][y - j]);
			}
		}

		// second half
		if (validMoves.contains("mdiag_second")) {

			for (int j = 1; (x - j) >= 0 && (y + j) < BOARD_SIZE
					&& !board[x - j][y + j].getColor().equals(color); j++) {
				board[x - j][y + j].setColor(color);
				System.out.println("Color reversed for " + board[x - j][y + j]);
			}
		}

		validMoves = "";
	}

	private boolean isGameOver() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (board[i][j].getColor().equals(Color.NOCLR))
					return false;
			}
		}

		return true;
	}

	private void printResult() {

		System.out.println("Game Over!!");
		int blackBalls = 0;
		int whiteBalls = 0;

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (board[i][j].getColor().equals(Color.BLACK))
					blackBalls++;
				else
					whiteBalls++;
			}
		}

		System.out.println("Black Balls: " + blackBalls + " ||| White Balls: " + whiteBalls);
	}

	@Override
	public String toString() {
		return displayBoard();
	}

	private String displayBoard() {
		String result = "";
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				result += board[i][j] + "  ";
			}

			result += "\n";
		}

		return result;
	}

}
