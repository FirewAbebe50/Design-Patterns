package cs525.labs.composite;


public class PageRenderer {
	TagComponent allTags;

	public PageRenderer(TagComponent allTags) {
		this.allTags = allTags;
	}

	public void printTag() {
		allTags.print();
	}
}
