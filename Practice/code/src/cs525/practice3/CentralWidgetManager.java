package cs525.practice3;

public class CentralWidgetManager extends WidgetManager {

	@Override
	public void renderWidgets(Window container) {

		if (((Container) container).getComponents().size() < 3) {
			// render the widgets
			//display widget
			
			container.paint();
			
			
			
		} else {
			this.nextManager.renderWidgets(container);
		}

	}

}
