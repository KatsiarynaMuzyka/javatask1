package sorting;

public class Sorting {

	public static void shellSorting(int[] array) {
		int size = array.length;
		for (int k = 0; k < size--; k++) {
			for (int i = 0; i < size; i++) {
				if (array[i] <= array[i + 1]) {
					continue;
				}
				if (array[i] > array[i + 1]) {
					int a = array[i];
					array[i] = array[i + 1];
					array[i + 1] = a;
					if (i > 0) {
						i--;
					}
				}
			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}

}
