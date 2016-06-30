package cs525.practice3;

public abstract class WidgetManager {

	protected WidgetManager nextManager;

	public abstract void renderWidgets(Window container);

}
