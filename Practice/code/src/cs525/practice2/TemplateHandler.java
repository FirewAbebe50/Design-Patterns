package cs525.practice2;

public abstract class TemplateHandler {

	protected TemplateHandler nextHandler;

	public abstract void handleContent(Content content);

}
