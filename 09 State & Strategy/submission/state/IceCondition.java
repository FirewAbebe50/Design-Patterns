package cs525.labs.state;

public class IceCondition implements RoadCondition{

	@Override
	public int getLeft() {
		return 1;
	}

	@Override
	public int getAccel() {
		return 3;
	}

	@Override
	public int getRight() {
		return 1;
	}

	@Override
	public int getBrake() {
		return 2;
	}
}
