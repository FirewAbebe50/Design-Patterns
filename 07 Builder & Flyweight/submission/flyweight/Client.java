package cs525.labs.flyweight;

public class Client {

	public static int NUMBER_OF_LINES = 20;
	public static final Image[] maps = new Image[] { Image.CALIFORNIA, Image.CHICAGO, Image.IOWACITY };

	public static void main(String[] args) {

		Address work = new Address("1002 N. 10th Street", "IowaCity", "Iowa", "52556");
		for (int i = 0; i < NUMBER_OF_LINES; ++i) {
			Image map = getRandomMap();
			ConcreteCustomerFlyweight customer = FlyweightFactory.getInstance(map);

			customer.logCustomerInfo(12523 + i, "Mark", "Twain" + (i + 1), work, new HealthProfile("Good Health"));
		}
	}

	private static Image getRandomMap() {
		return maps[(int) (Math.random() * maps.length)];
	}
}
