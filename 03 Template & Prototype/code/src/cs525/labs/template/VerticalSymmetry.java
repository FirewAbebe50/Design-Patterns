package cs525.labs.template;

public class VerticalSymmetry extends LetterSymmetry {

	@Override
	public char[][] reconstructLetter(char[][] letterDefn, int col, int row) {

		int originalRow = letterDefn.length;  //14 
		int originalCol = letterDefn[0].length;  //5

		char[][] completeLetter = new char[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i >= originalRow) {
					completeLetter[i][j] = '-';
				}

				else {
					if (j < originalCol) {
						completeLetter[i][j] = letterDefn[i][j];
					}
					else if ((2 * originalCol - j - 1) >= 0) {
						
						completeLetter[i][j] = letterDefn[i][2 * originalCol - j - 1];
					} else {
						completeLetter[i][j] = '-';
					}
				}
			}
		}

		return completeLetter;
	}

}
