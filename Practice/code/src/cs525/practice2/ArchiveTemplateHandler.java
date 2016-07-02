package cs525.practice2;

public class ArchiveTemplateHandler extends TemplateHandler {

	@Override
	public void handleContent(Content content) {

		// can handle the content
		if (content.contentType.equals("archive")) {

			System.out.println("Rendering content on the Archive Template");
			// render the content on the template
			
		} else {
			this.nextHandler.handleContent(content);
		}
	}

}
