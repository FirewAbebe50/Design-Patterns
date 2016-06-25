package cs525.labs.composite;

public class TagLeaf extends TagComponent {

	private String name; // html tag name
	private String text; // html tag inner text
	private String attribute; // html tag attribute

	public TagLeaf(String name, String attribute, String text) {
		this.name = name;
		this.text = text;
		this.attribute = attribute;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	public String getAttribute() {
		return attribute;
	}

	public void print() {
		
		String content = "";
		if (!attribute.isEmpty())
			content = "<" + name + " " + attribute + ">";
		else
			content = "<" + name + ">";
		
		if (!text.isEmpty())
			content += text;
		
		System.out.println(content + "</" + name + ">");
	}

}
