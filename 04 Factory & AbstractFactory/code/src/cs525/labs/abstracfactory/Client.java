package cs525.labs.abstracfactory;

public class Client {

	private PackagingFactory factory;

	public Client(String user) {
		if (user.equals("kids"))
			factory = new KidsPackagingFactory();
		else if (user.equals("business"))
			factory = new BusinessPackagingFactory();
		else
			factory = new AdultPackagingFactory();
	}

	public PackagingFactory getFactory() {
		return factory;
	}

	public static void main(String[] args) {

		Client client = new Client("kids");
		PackagingFactory pf = client.getFactory();
		
		AbstractBag bag = pf.createBag();
		System.out.println(bag.getPackagingInfo() + " with Cost: $" + bag.getPackagingCost());
		
		AbstractBox box = pf.createBox();
		System.out.println(box.getPackagingInfo() + " with Cost: $" + box.getPackagingCost());
		
		AbstractWrap wrap = pf.createWrap();
		System.out.println(wrap.getPackagingInfo() + " with Cost: $" + wrap.getPackagingCost());
	}
}
