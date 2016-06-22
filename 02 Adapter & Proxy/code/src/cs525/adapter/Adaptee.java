package cs525.adapter;

public class Adaptee {

	// fixed length array for holding data
	private String[] data = new String[20];
	private int start = 0;
	private int end = 0;

	public String startString() {
		return data[start];
	}

	public String endString() {
		return data[end];
	}

	public void add(String str) {
		data[end] = str;
		end++;
	}

	public boolean empty() {
		return (end == -1);
	}

	public void remove(int pos) {
		for (int i = pos; i < end; i++) {
			data[i] = data[i + 1];
		}
	}

	public String get(int pos) {
		return data[pos];
	}

	public int getEnd() {
		return end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
