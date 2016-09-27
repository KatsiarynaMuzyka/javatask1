package main;

import twoArrays.TwoArrays;

public class Main {

	public static void main(String[] args) {
		
		int arrayA[] = {1, 1, 3, 4, 6, 9, 9, 12, 12, 13, 14};
		int arrayB[] = {2, 3, 3, 5, 6, 7, 9, 10, 11, 11, 13};
		
		System.out.println(TwoArrays.searchPosition(arrayA, arrayB));
		
	}

}
