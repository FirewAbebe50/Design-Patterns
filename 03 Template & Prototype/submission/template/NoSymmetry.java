package cs525.labs.template;

public class NoSymmetry extends LetterSymmetry {

	@Override
	public char[][] reconstructLetter(char[][] letterDefn, int col, int row) {

		char[][] completeLetter = new char[row][col];
		int originalRow = letterDefn.length;
		int originalCol = letterDefn[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i >= originalRow || j >= originalCol) {
					completeLetter[i][j] = '-';
				} else {
					
					completeLetter[i][j] = letterDefn[i][j];
				}
			}
		}

		return completeLetter;

	}

}
