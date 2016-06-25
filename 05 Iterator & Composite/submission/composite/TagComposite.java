package cs525.labs.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TagComposite extends TagComponent {

	private List<TagComponent> tagComponents = new ArrayList<TagComponent>();
	private String name; // tag name
	private String text; // html tag inner text
	private String attribute; // html tag attribute

	public TagComposite(String name, String attribute, String text) {
		this.name = name;
		this.text = text;
		this.attribute = attribute;
	}

	public TagComposite(String name) {
		this.name = name;
		this.text = "";
		this.attribute = "";
	}

	public void add(TagComponent tagComponent) {
		tagComponents.add(tagComponent);
	}

	public void remove(TagComponent tagComponent) {
		tagComponents.remove(tagComponent);
	}

	public TagComponent getChild(int i) {
		return (TagComponent) tagComponents.get(i);
	}

	public String getAttribute() {
		return attribute;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	public void print() {
		if (!attribute.isEmpty())
			System.out.println("<" + name + " " + attribute + ">");
		else
			System.out.println("<" + name + ">");
		if (!text.isEmpty())
			System.out.println(text);

		Iterator<TagComponent> iterator = tagComponents.iterator();
		while (iterator.hasNext()) {
			TagComponent tagComponent = (TagComponent) iterator.next();
			tagComponent.print();
		}

		System.out.println("</" + name + ">");
	}

}
