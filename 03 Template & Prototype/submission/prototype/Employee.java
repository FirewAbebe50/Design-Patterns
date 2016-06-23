package cs525.labs.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Employee implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String lastName;
	private String firstName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee[] staff;

	public Employee() {

	}

	public Employee(int id, String lastName, String firstName, String streetAddress, String city, String state,
			String zipcode, Employee supervisor, Employee[] staff) {

		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.supervisor = supervisor;
		this.staff = staff;
	}

	/**
	 * Copy Constructor or factory constructor as deep cloner
	 * 
	 * @param source
	 */

	public Employee(Employee source) {
		super();
		this.id = source.id;
		this.lastName = source.lastName;
		this.firstName = source.firstName;
		this.streetAddress = source.streetAddress;
		this.city = source.city;
		this.state = source.state;
		this.zipcode = source.zipcode;
		if (source.supervisor != null)
			this.setSupervisor(new Employee(source.supervisor));

		if (source.staff != null && source.staff.length != 0 && source.staff.length > 0) {
			this.staff = new Employee[source.staff.length];
			for (int i = 0; i < source.staff.length; i++) {
				this.staff[i] = new Employee(source.staff[i]);
			}
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return deepCloneWithSerialization();
		// return new Employee(this);
		// return cloneObjectWithReflection(this);
	}

	protected Object shallowClone() throws CloneNotSupportedException {

		return super.clone();
	}

	// it deep clones using serialization/de-serialization
	private Object deepCloneWithSerialization() {
		Object clone;
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		ObjectOutputStream outStream;
		try {
			outStream = new ObjectOutputStream(byteStream);
			outStream.writeObject(this);
			outStream.flush();
			outStream.close();
			byteStream.close();
			byte[] byteData = byteStream.toByteArray();

			// deserialize bytes
			ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteData);
			clone = (Object) new ObjectInputStream(byteInputStream).readObject();
			return clone;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	// Deep cloning using reflection
	private static Object cloneObjectWithReflection(Object obj) {
		try {
			Object clone = obj.getClass().newInstance();
			for (Field field : obj.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				if (field.get(obj) == null || Modifier.isFinal(field.getModifiers())) {
					continue;
				}
				if (field.getType().isPrimitive() || field.getType().equals(String.class)
						|| field.getType().getSuperclass().equals(Number.class)
						|| field.getType().equals(Boolean.class)) {
					field.set(clone, field.get(obj));
				} else {
					Object childObj = field.get(obj);
					if (childObj == obj) {
						field.set(clone, clone);
					} else {
						field.set(clone, cloneObjectWithReflection(field.get(obj)));
					}
				}
			}
			return clone;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "[Id: " + this.id + ", FirstName: " + this.firstName + ", LastName: " + this.lastName
				+ ((supervisor != null && supervisor.firstName != null) ? ", Supervisor: { " + this.supervisor + " }"
						: "")
				+ printStaff() + "]";
	}

	private String printStaff() {
		String staffs = "";
		if (this.staff != null && this.staff.length > 0) {
			for (Employee sf : this.staff) {
				staffs += sf + " ";
			}
		}

		if (!staffs.isEmpty())
			return ", Staff: { " + staffs + " }";
		return staffs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

}
