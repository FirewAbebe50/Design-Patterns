package cs525.labs.flyweight;

public class FlyweightFactory {

	static ConcreteCustomerFlyweight[] byMap = new ConcreteCustomerFlyweight[6];
	static {
		byMap[0] = new ConcreteCustomerFlyweight(Image.CHICAGO);
		byMap[1] = new ConcreteCustomerFlyweight(Image.CALIFORNIA);
		byMap[2] = new ConcreteCustomerFlyweight(Image.DEMOINES);
		byMap[3] = new ConcreteCustomerFlyweight(Image.IOWACITY);
		byMap[4] = new ConcreteCustomerFlyweight(Image.NEWYORK);
		byMap[5] = new ConcreteCustomerFlyweight(Image.TEXAS);

	}

	public static ConcreteCustomerFlyweight getInstance(Image map) {
		int i = Math.abs(map.hashCode() % 6);
		ConcreteCustomerFlyweight line = byMap[i];
		return line;
	}

	public static ConcreteCustomerFlyweight getInstance(int i) {
		return byMap[i];
	}
}
