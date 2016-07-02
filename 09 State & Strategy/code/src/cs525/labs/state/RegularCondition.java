package cs525.labs.state;

/**
 * Concrete State
 * 
 * @author OWNER
 *
 */
public class RegularCondition implements RoadCondition {

	@Override
	public int getLeft() {
		return 5;
	}

	@Override
	public int getAccel() {
		return 9;
	}

	@Override
	public int getRight() {
		return 5;
	}

	@Override
	public int getBrake() {
		return 8;
	}

}
