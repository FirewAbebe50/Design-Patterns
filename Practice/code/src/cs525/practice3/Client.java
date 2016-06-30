package cs525.practice3;

public class Client {

	public static void main(String[] args) {

		WidgetFactory wf = new WindowsWidgetFactoroy();
		Window root = wf.createContainer("windows");

		ChianBuilder cb = new ChianBuilder();

		cb.buildChain();

		WidgetManager m = cb.getHandler();
		m.renderWidgets(root);

	}
}
