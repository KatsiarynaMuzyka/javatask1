package numberSequence;

public class NumberSequence {

	public int minCountNumber(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int step = 0;
			if (array[i] <= array[i + 1]) {
				continue;
			} else {
				int j = i + 1;
				while (array[i] > array[j]) {
					count++;
					step++;
					j++;
				}
				i += step;
			}
		}
		return count;
	}
}
