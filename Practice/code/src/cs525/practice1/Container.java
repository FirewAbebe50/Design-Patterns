package cs525.practice1;

import java.util.ArrayList;
import java.util.List;

public class Container extends Window {

	List<Window> components = new ArrayList<>();

	public Container(String title){
		super(title);
	}
	
	@Override
	public void paint() {

		System.out.println(this.title);
		
		for(Window component : components){
			component.paint();
		}
		
	}

	@Override
	public void add(Window component) {
		components.add(component);

	}

	@Override
	public void remove(Window component) {
		components.remove(component);

	}

	@Override
	public Window getChild(int n) {
		if (components.size() > n) {
			return components.get(n);
		}

		return null;
	}

}
