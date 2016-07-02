package cs525.labs.state;

public class GravelCondition implements RoadCondition{

	@Override
	public int getLeft() {
		return 3;
	}

	@Override
	public int getAccel() {
		return 7;
	}

	@Override
	public int getRight() {
		return 3;
	}

	@Override
	public int getBrake() {
		return 6;
	}

}
