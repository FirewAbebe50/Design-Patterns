package cs525.labs.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("_________FOR A__________\n");

		File file = new File("input/a.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));

		// We can create a factory to identity letter symmetry, that will
		// instantiate the appropriate concrete class with the help of first
		// line of input file
		// But, for this lab, as we've not studied factory pattern yet, I'm
		// using concrete class directly
		LetterSymmetry ls = new VerticalSymmetry();
		ls.constructLetter(reader);
		
		System.out.println("_________FOR B__________\n");
		file = new File("input/b.txt");
		reader = new BufferedReader(new FileReader(file));
		ls = new NoSymmetry();
		ls.constructLetter(reader);
		
		
		System.out.println("_________FOR C__________\n");
		file = new File("input/c.txt");
		reader = new BufferedReader(new FileReader(file));
		ls = new HorizontalSymmetry();
		ls.constructLetter(reader);
	}

}
