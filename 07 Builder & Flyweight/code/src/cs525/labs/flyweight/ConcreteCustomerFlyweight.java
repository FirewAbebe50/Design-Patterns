package cs525.labs.flyweight;

public class ConcreteCustomerFlyweight implements CustomerFlyweight {

	private Image locationMap;

	public ConcreteCustomerFlyweight(Image map) {
		this.locationMap = map;
	}

	@Override
	public void logCustomerInfo(int id, String fName, String lName, Address address, HealthProfile profile) {

		System.out.println("Customer ID: " + id + "\nFirstName: " + fName + "\nLastName: " + lName + address + profile
				+ "\nLocation Map: " + locationMap + "\n");
		System.out.println("_________________________________________________________");

	}

}
