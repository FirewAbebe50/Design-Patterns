package cs525.practice1;

public class Client {

	public static void main(String[] args) {

		Window root = new Container("window");
		Window container1 = new Container("cont1");
		Window widget = new Container("widget");

		container1.add(widget);
		root.add(container1);
		Window container2 = new Container("cont2");
		root.add(container2);
		
		root.paint();

	}
}
