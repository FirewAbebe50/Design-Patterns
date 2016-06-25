package cs525.labs.composite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {

		Client client = new Client();

		// File file = new File("input/html.txt");
		// BufferedReader reader = new BufferedReader(new FileReader(file));

		PageRenderer render = new PageRenderer(client.parseHtml());
		render.printTag();

	}

	public TagComponent parseHtml() {

		/*
		 * if (node.childNodeSize() > 0 &&
		 * !node.childNode(0).nodeName().contains("#")) {
		 * 
		 * String tagName = node.nodeName(); String attr =
		 * node.attributes().toString();
		 * 
		 * TagComponent tag = new TagComposite(tagName, attr, ""); for (int i =
		 * 0; i < node.childNodeSize(); i++) {
		 * tag.add(parseHtml(node.childNode(i), tag)); root.add(tag); }
		 * 
		 * return tag; } else if (node.childNodeSize() > 0) { String tagName =
		 * node.nodeName(); String attr = node.attributes().toString(); String
		 * text = node.childNodes().toString();
		 * 
		 * TagComponent leaf = new TagLeaf(tagName, attr, text); root.add(leaf);
		 * }
		 * 
		 * return root;
		 */

		TagComponent root = new TagComposite("HTML");
		TagComponent head = new TagComposite("HEAD");
		TagComponent body = new TagComposite("BODY");
		head.add(new TagLeaf("TITLE", "", "Your Title Here"));

		TagComponent center = new TagComposite("CENTER");
		center.add(new TagLeaf("IMG", "SRC='clouds.jpg'", ""));
		TagComponent a = new TagLeaf("a", "href='http://somegreatsite.com'", "Link Name");
		TagComponent h1 = new TagLeaf("H1", "", "This is a Header");
		TagComponent h2 = new TagLeaf("H2", "", "This is a Medium Header");
		TagComponent b = new TagLeaf("B", "", "This is a New Paragraph!");
		TagComponent b1 = new TagComposite("B", "", "");
		b1.add(new TagLeaf("I", "", "This is a new sentence without a paragraph break, in bold italics."));
		body.add(center);
		body.add(a);
		body.add(h1);
		body.add(h2);
		body.add(b);
		body.add(b1);

		root.add(head);
		root.add(body);
		return root;

	}
}
