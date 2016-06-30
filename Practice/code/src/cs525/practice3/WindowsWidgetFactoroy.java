package cs525.practice3;

public class WindowsWidgetFactoroy extends WidgetFactory {

	@Override
	public Widget createWidget(String name) {
		
		return new Widget(name); //WindowsWidget
	}

	@Override
	public Container createContainer(String name) {
		// TODO Auto-generated method stub

		return new Container(name); //WIndowsContainer
	}

}
