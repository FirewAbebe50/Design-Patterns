package cs525.labs.state;

/**
 * This class holds the condition of the road. When the user clicks a button, to
 * accelerate or turn left, etc., the amount of acceleration, turn, etc.,
 * depends on the road conditions.
 * <P>
 * This class implements the State pattern.
 */

public class RoadModel {

	private RoadCondition regular;
	private RoadCondition gravel;
	private RoadCondition wet;
	private RoadCondition ice;
	private RoadCondition condition;
	private String road = "Regular";
	private String type = "Amount of Left turn: ";

	public RoadModel() {
		regular = new RegularCondition();
		gravel = new GravelCondition();
		wet = new WetCondition();
		ice = new IceCondition();

		condition = regular;
	}

	public void setCondition(RoadCondition condition) {

		road = condition.getClass().getSimpleName();
		this.condition = condition;
	}

	public int getAccel() {

		type = "Amount of Acceleration: ";
		return condition.getAccel();
	}

	public int getLeft() {
		type = "Amount of Left turn: ";
		return condition.getLeft();
	}

	public int getRight() {
		type = "Amount of Right turn: ";
		return condition.getRight();
	}

	public int getBrake() {
		type = "Amount of Brake: ";
		return condition.getBrake();
	}

	@Override
	public String toString() {
		//return "Road Condition: " + road + ", " + type;
		return "Amount: ";
	}
}