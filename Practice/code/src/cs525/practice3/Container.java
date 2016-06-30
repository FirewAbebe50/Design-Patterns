package cs525.practice3;

import java.util.ArrayList;
import java.util.List;

public class Container extends Window {

	List<Window> components = new ArrayList<>();
	private WidgetManager manager;

	public WidgetManager getManager() {
		return manager;
	}

	public void setManager(WidgetManager manager) {
		this.manager = manager;
	}

	public Container(String title) {
		super(title);
	}

	public List<Window> getComponents() {
		return components;
	}

	@Override
	public void paint() {

		System.out.println(this.title);

		for (Window component : components) {
			component.paint();
		}

	}

	@Override
	public void add(Window component) {

		if (component.equals(this))
			return;

		if (component instanceof Container) {
			Container container = (Container) component;
			if (container.getComponents().contains(this))
				return;
		}

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
