package twoArrays;

public class TwoArrays {

	public static String searchPosition(int arrayA[], int arrayB[]) {
		StringBuffer sb = new StringBuffer();
		int j;
		for (int i = 0; i < arrayB.length; i++) {
			for (j = 0; j < arrayA.length; j++) {
				if ((arrayB[i] >= arrayA[j]) && (arrayB[i] <= arrayA[j + 1])) {
					sb.append((j + 1) + " ");
					break;
				}
			}
		}
		return sb.toString();
	}

}
