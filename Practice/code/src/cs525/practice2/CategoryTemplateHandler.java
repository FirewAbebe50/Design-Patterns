package cs525.practice2;

public class CategoryTemplateHandler extends TemplateHandler {

	@Override
	public void handleContent(Content content) {
		// can handle the content
		if (!(content.contentType.equals("Front-Page") || content.contentType.equals("Archive"))) {

			System.out.println("Rendering content on the Category Template");
			// render the content on the template

		} else {
			this.nextHandler.handleContent(content);
		}

	}

}
