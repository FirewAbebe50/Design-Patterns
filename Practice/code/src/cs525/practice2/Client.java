package cs525.practice2;

public class Client {

	public static void main(String[] args) {

		ChainBuilder builder = new ChainBuilder();
		builder.buildChain();
		TemplateHandler handler = builder.getHandler();
		handler.handleContent(new Content("Category"));

	}
}
