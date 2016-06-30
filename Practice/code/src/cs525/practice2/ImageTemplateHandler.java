package cs525.practice2;

public class ImageTemplateHandler extends TemplateHandler {

	@Override
	public void handleContent(Content content) {
		// can handle the content
		if (content.contentType.equals("Image")) {

			System.out.println("Rendering content on the Image Template");
			// render the content on the template

		} else {
			this.nextHandler.handleContent(content);
		}

	}

}
