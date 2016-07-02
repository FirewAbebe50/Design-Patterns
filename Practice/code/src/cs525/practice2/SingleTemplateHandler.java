package cs525.practice2;

public class SingleTemplateHandler extends TemplateHandler {

	@Override
	public void handleContent(Content content) {
		// can handle the content
		if (content.contentType.equals("Post")) {

			System.out.println("Rendering content on the Archive Template");
			// render the content on the template

		} else {
			this.nextHandler.handleContent(content);
		}

	}

}
