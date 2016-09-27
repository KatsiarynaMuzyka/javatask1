package main;

import numberSequence.NumberSequence;

public class Main {

	public static void main(String[] args) {
		NumberSequence numberSequence = new NumberSequence();
		int array[] = { 3, 2, 6, -3, 7, 2, 12 };
		System.out.println("min count " + numberSequence.minCountNumber(array));
	}

}
