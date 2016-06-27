package cs525.labs.command;

/**
 * 
 * Receiver class
 * 
 * @author OWNER
 *
 */
public class Square {

	private int dim;
	private int move = 0;
	
	private DrawSquare drawSquare;

	public Square(int dim) {
		this.dim = dim;
		drawSquare = new DrawSquare();
	}

	public void create() {
		
		drawSquare.undoDraw();
		drawSquare.draw(dim, move);
		System.out.println("CREATE: " + this.toString());
	}

	public void scale(double factor) {
		
		dim *= factor;
		drawSquare.undoDraw();
		drawSquare.draw(dim, move);
		System.out.println("SCALE: " + this.toString());
	}

	public void moveRight(int pos) {

		move = pos;
		drawSquare.undoDraw();
		drawSquare.draw(dim, pos);
		System.out.println("MOVERIGHT: " + this + " moved right by " + pos);
	}

	public void closeWindow() {
		drawSquare.undoDraw();
		System.out.println("UNDO: removing the square from canvas");
	}

	@Override
	public String toString() {
		return "Square with size " + dim + "*" + dim;
	}

}
