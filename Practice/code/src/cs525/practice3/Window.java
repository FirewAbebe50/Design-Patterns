package cs525.practice3;

public abstract class Window {

	protected String title;

	public Window(String title) {
		this.title = title;
	}

	public abstract void paint();

	public abstract void add(Window component);

	public abstract void remove(Window component);

	public abstract Window getChild(int n);
	
	
}
