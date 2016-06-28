package cs525.labs.flyweight;

public class ConcreteCustomerHeavyweight implements CustomerFlyweight {

	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;

	private Image locationMap;

	public ConcreteCustomerHeavyweight(int id, String fName, String lName, Address address, HealthProfile profile,
			Image map) {

		this.customerId = id;
		this.firstName = fName;
		this.lastName = lName;
		this.residenceAddress = address;
		this.profile = profile;
		this.locationMap = map;

	}

	@Override
	public void logCustomerInfo(int id, String fName, String lName, Address address, HealthProfile profile) {
		
		System.out.println("Customer ID: " + id + "\nFirstName: " + fName + "\nLastName: " + lName + address + profile);

	}

}
