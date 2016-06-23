package cs525.labs.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee manager = new Employee();
		manager.setId(230);
		manager.setFirstName("Tom");
		manager.setLastName("White");

		Employee supervisor = new Employee();
		supervisor.setId(342);
		supervisor.setLastName("Clinton");
		supervisor.setFirstName("Mike");

		Employee staff1 = new Employee();
		staff1.setId(34343);
		staff1.setFirstName("Michael");
		staff1.setLastName("Guthrie");
		//staff1.setSupervisor(manager);
		
		
		manager.setStaff(new Employee[] { staff1 });
		manager.setSupervisor(supervisor);

		Employee deepClone = (Employee) manager.clone();
		Employee shallowClone = (Employee) manager.shallowClone();

		System.out.println("\n_______Initial Info___________\n");
		System.out.println(manager);
		System.out.println("\n_______Deep Cloned Copy___________\n");
		System.out.println(deepClone);
		
		System.out.println("\n_______AFTER MODIFICATION (STAFF LNAME)___________\n");
		staff1.setLastName("Guthrie Changed");
		System.out.println("\n_______Initial Info___________\n");
		System.out.println(manager);
		System.out.println("\n_______Deep Cloned Copy___________\n");
		System.out.println(deepClone);
		System.out.println("\n_______Shallow Cloned Copy___________\n");
		System.out.println(shallowClone);
		

	}
}
