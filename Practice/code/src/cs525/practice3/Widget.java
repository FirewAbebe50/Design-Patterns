package cs525.practice3;

public class Widget extends Window{

	public Widget(String title) {
		super(title);
	}

	@Override
	public void paint() {
		System.out.println(title);
		
	}

	@Override
	public void add(Window component) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Window component) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Window getChild(int n) {
		throw new UnsupportedOperationException();
	}

}
