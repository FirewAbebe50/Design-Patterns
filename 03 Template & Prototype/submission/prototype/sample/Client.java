package cs525.labs.prototype.sample;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person("Fred");
		System.out.println("person 1:" + person1);
		
		
		Person person2 = (Person) person1.clone();
		System.out.println("person 2:" + person2);
		
		person1.setName("Jivan");
		
		System.out.println("Modified: " + person1);
		
		System.out.println("modified person 2:" + person2);
		
	}
}
