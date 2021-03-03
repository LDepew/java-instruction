package business;

public class BasicCalculations {
	private int square;
	private int countA;
//	+ int square(int nbr):  accepts an int and returns the int squared
//	+ int countA(String str):  accepts a String and returns an int
//	  representing the number of times the letter 'a' occurs (either lower or upper case)
	
	public BasicCalculations() {
		super();
	}

	public BasicCalculations(int square, int countA) {
	super();
	this.square = square;
	this.countA = countA;
}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public int getCountA() {
		return countA;
	}

	public void setCountA(int countA) {
		int totalCount = countA.length();
		int totalCountAfter = countA.replace("a", "");
		int count = (totalCount - totalCountAfter);
		return Integer.parseInt(str);
		System.out.println("number of A is: "+count);
		this.countA = countA;
	}

	@Override
	public String toString() {
		return "BasicCalculations [square=" + square + ", countA=" + countA + "]";
	}
	
	int countA(String str) {
		int totalCount = str.length();
		int totalCountAfter = countA.replace("a", "");
		int count = (totalCount - totalCountAfter);
		return Integer.parseInt(str);
		System.out.println("number of A is: "+count);
	}
	}

	 
}