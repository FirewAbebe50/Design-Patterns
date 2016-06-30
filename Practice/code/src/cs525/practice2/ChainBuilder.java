package cs525.practice2;

public class ChainBuilder {

	private TemplateHandler handler;

	public TemplateHandler getHandler() {
		return this.handler;
	}

	public void buildChain() {
		this.handler = new ImageTemplateHandler();
		TemplateHandler single = new SingleTemplateHandler();
		TemplateHandler category = new CategoryTemplateHandler();
		TemplateHandler archive = new ArchiveTemplateHandler();
		TemplateHandler generic = new GenericTemplateHandler();

		handler.nextHandler = single;
		single.nextHandler = category;
		category.nextHandler = archive;
		archive.nextHandler = generic;

	}

}
