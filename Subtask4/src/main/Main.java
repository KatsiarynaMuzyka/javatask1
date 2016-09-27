package main;

import primeNumbers.PrimeNumbers;

public class Main {

	public static void main(String[] args) {
		
		int n = (int)(Math.random() * ((9) + 1));
		
		PrimeNumbers numbers = new PrimeNumbers();
		int array [] = new int [n];
		numbers.arrayFill(array);
		System.out.println();
		System.out.println(numbers.checkPrimeNumbers(array));
	}

}
