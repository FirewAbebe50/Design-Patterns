package cs525.labs.prototype.sample;

import com.rits.cloning.Cloner;

public class Person implements Cloneable {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Cloner cloner = new Cloner();
		System.out.println("Deep");
		//return cloner.deepClone(this);
		
		Person p = (Person)super.clone();
		
		
		return p;
	}

	public String toString() {
		return "[name: " + name + ", @" + Integer.toHexString(System.identityHashCode(name))+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}