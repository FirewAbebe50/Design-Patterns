package cs525.labs.mediator;

public class Ball {

	private Position position;
	private Color color;

	public Ball(Position p, Color c) {
		this.position = p;
		this.color = c;
	}

	public Position getPosition() {
		return position;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "[" + color + ", " + position + "]";
	}

}
