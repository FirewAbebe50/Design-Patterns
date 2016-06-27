package cs525.labs.command;

/**
 * Concrete Command
 * 
 * @author OWNER
 *
 */
public class MoveRightSquare implements TransformSquare {

	private Square square;
	private int unit;
	private int prevUnit;

	public MoveRightSquare(Square square, int unit) {
		this.square = square;
		this.unit = unit;
	}

	@Override
	public void execute() {

		prevUnit = unit;
		this.square.moveRight(unit);
	}

	@Override
	public void undo() {

		this.square.moveRight(prevUnit - unit);

	}

}
