package cs525.labs.command;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Canvas extends JComponent {

	private int len;
	private int initialPos = 0;

	public Canvas(int len, int pos) {
		this.len = len;
		this.initialPos = pos;
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(initialPos, initialPos, len, len);
	}
}
