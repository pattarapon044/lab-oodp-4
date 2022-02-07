package lab.oodp.moreclass.pattern;

public class Pattern {
	
	private char symbal;
	private int number;
	
	public Pattern(int number, char symbal) {
		this.number = number;
		this.symbal = symbal;
	}

	public char getSymbal() {
		return symbal;
	}

	public void setSymbal(char symbal) {
		this.symbal = symbal;
	}

	public int getNumberOfCharacters() {
		return number;
	}

	public void setNumberOfCharacters(int number) {
		this.number = number;
	}
	
	public String toString() {
		String pattern = new String();
		for (int i = 0; i < number; i++) {
			pattern += symbal;
		}
		return pattern;
	}
}
