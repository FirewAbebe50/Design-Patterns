package cs525.labs.state;

public class WetCondition implements RoadCondition {

	@Override
	public int getLeft() {
		return 4;
	}

	@Override
	public int getAccel() {
		return 9;
	}

	@Override
	public int getRight() {
		return 4;
	}

	@Override
	public int getBrake() {
		return 7;
	}
}
