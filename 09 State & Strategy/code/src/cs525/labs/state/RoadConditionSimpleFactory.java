package cs525.labs.state;

public class RoadConditionSimpleFactory implements RoadConditionFactory {

	private static RoadConditionFactory factory = new RoadConditionSimpleFactory();

	private RoadConditionSimpleFactory() {
	}

	public static RoadConditionFactory getInstance() {
		return factory;
	}

	@Override
	public RoadCondition getCondition(String type) {

		if (type.equals("ice"))
			return new IceCondition();
		if (type.equals("gravel"))
			return new GravelCondition();
		if (type.equals("wet"))
			return new WetCondition();
		return new RegularCondition();
	}

}
