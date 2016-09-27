package primeNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrimeNumbers {
	PrimeNumbers primeNumbers = new PrimeNumbers();
	
	@Test
	public void tstPrimeNumbers() {
		int array[] = {20, 71, 9, 97, 85, 29, 80};
		int arr[] = { 2, 4, 6 };
		String dtr=new String(arr.toString());
		assertEquals(dtr, primeNumbers.checkPrimeNumbers(array));
	}

}
