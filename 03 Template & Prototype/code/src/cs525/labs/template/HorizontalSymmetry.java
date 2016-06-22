package cs525.labs.template;

public class HorizontalSymmetry extends LetterSymmetry {

	@Override
	public char[][] reconstructLetter(char[][] letterDefn, int col, int row) {

		char[][] completeLetter = new char[row][col];
		int originalRow = letterDefn.length;
		int originalCol = letterDefn[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j >= originalCol) {
					completeLetter[i][j] = '-';
				} else {
					if (i < originalRow) {
						completeLetter[i][j] = letterDefn[i][j];
					} else if ((2 * originalRow - i - 1) >= 0) {
						completeLetter[i][j] = letterDefn[2 * originalRow - i - 1][j];
					} else {
						completeLetter[i][j] = '-';
					}
				}
			}
		}
		
		return completeLetter;
	}

}
