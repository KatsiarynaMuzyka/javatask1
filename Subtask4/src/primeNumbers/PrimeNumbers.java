package primeNumbers;

public class PrimeNumbers {
	public void arrayFill(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * ((99) + 1));
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public String checkPrimeNumbers(int array[]) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 1; j <= array[i]; j++) {
				if (array[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				str.append(i+1 + " ");
			}
		}
		return str.toString();
	}
}
