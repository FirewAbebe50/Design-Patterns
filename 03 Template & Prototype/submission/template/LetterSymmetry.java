package cs525.labs.template;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class LetterSymmetry {

	private int col = 0;
	private int row = 0;

	// template method
	public final void constructLetter(BufferedReader reader) throws NumberFormatException, IOException {

		char[][] letterDefn = readFile(reader);
		char[][] completeLetter = reconstructLetter(letterDefn, col, row);
		printLetter(completeLetter);

	}

	private char[][] readFile(BufferedReader file) throws NumberFormatException, IOException {
		
		
		String symmetryType = file.readLine();
		
		int originalCol = Integer.parseInt(file.readLine());
		int originalRow = Integer.parseInt(file.readLine());
		
		char[][] letterDefn = new char[originalRow][originalCol];
		
		this.col = Integer.parseInt(file.readLine());
		this.row = Integer.parseInt(file.readLine());
		
		String line = "";
		int rowCounter = 0;
		while((line = file.readLine()) != null){
			char[] chars = line.toCharArray();
			letterDefn[rowCounter] = chars;
			rowCounter++;
		}
		
		return letterDefn;
	}

	public abstract char[][] reconstructLetter(char[][] letterDefn, int col, int row);

	private void printLetter(char[][] combinations) {

		for (int i = 0; i < combinations.length; i++) {
			for (int j = 0; j < combinations[0].length; j++) {
				System.out.print(combinations[i][j]);
			}
			System.out.println();
		}
	}
}
