package matrix;

public class Matrix {
	private int[][] result;

	public Matrix(int size) {
		result = new int[size][size];
	}

	public void matrix(int[] arr) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0, k = i; j < result[i].length; j++, k++) {
				if (k == arr.length) {
					k = 0;
					result[i][j] = arr[k];
				} else {
					result[i][j] = arr[k];
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				sb.append(result[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
