package cs525.labs.iterator;

import java.util.Arrays;

public class NameRepository implements Aggregate {

	private String[][] names = { { "Lob1" }, { "Jon2" }, { "Jul3" }, { "Rob4" }, { "Pat5" } };

	public synchronized void delete(String name) {
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				if (names[i][j].equals(name)) {
					names[i][j] = "-";
				}

			}
		}

		reorder();
	}

	public synchronized void add(String name) {
		String[][] nameList = Arrays.copyOf(names, names.length + 1);
		nameList[names.length] = new String[] { name };
		names = nameList;

		reorder();
	}

	private void reorder() {
		for (int j = 0; j < names.length; j++) {
			for (int i = names[j].length - 2; i >= 0; i--) {
				if (names[j][i].equals("-")) {
					for (int k = i; k < names.length; k++) {
						if (!names[j][k].equals("-")) {
							String temp = names[j][k - 1];
							names[j][k - 1] = names[j][k];
							names[j][k] = temp;
						}
					}
				}
			}
		}
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int rowIndex = 0;
		int colIndex = 0;

		@Override
		public  boolean hasNext() {
			while (rowIndex < names.length) {
				while (colIndex < names[rowIndex].length && !names[rowIndex][colIndex].equals("-")) {
					if (!names[rowIndex][colIndex].equals("-"))
						return true;
					colIndex++;
				}
				colIndex = 0;
				rowIndex++;
			}

			return false;
		}

		@Override
		public  Object next() {
			if (this.hasNext()) {

				return names[rowIndex][colIndex++];
			}
			return null;
		}

	}

}
