package cs525.labs.command;

/**
 * Concrete Command
 * @author OWNER
 *
 */
public class ScaleSquare implements TransformSquare {

	private Square square;
	private int factor;

	public ScaleSquare(Square square, int factor) {
		this.square = square;
		this.factor = factor;
	}

	@Override
	public void execute() {
		this.square.scale(factor);

	}

	@Override
	public void undo() {

		this.square.scale(1.0/factor);
	}

}
