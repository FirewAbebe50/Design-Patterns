package cs525.labs.command;

/**
 * 
 * Concrete Command
 * 
 * @author OWNER
 *
 */
public class CreateSquare implements TransformSquare {

	private Square square;

	public CreateSquare(Square square) {
		this.square = square;
	}

	@Override
	public void execute() {

		this.square.create();
	}

	@Override
	public void undo() {

		this.square.closeWindow();
	}

}
