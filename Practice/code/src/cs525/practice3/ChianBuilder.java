package cs525.practice3;

public class ChianBuilder {

	private WidgetManager handler;

	public WidgetManager getHandler() {
		return this.handler;
	}

	public void buildChain() {
		handler = new CentralWidgetManager();
		WidgetManager quadrant = new QuadrantWidgetManager();
		WidgetManager seq = new SequentialWidgetManger();

		handler.nextManager = quadrant;
		quadrant.nextManager = seq;
	}
}
