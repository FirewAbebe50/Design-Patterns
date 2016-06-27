package cs525.labs.command;

import javax.swing.JFrame;

public class DrawSquare {

	private JFrame window;

	public DrawSquare() {
		this.window = new JFrame();
	}

	public void draw(int len, int initialPosition) {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 500, 500);
		window.getContentPane().add(new Canvas(len, initialPosition));
		
		window.setVisible(true);
	}

	public void undoDraw() {
		window.getContentPane().removeAll();
	}
}
