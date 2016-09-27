package matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrix {
	Matrix matrix = new Matrix(6);

	@Test
	public void tstMatrix() {
		int[] array = { 1, 2, 3, 4, 5, 6};
		int arr[][] = { {1, 2, 3, 4, 5, 6},
						{2, 3, 4, 5, 6, 1},
						{3, 4, 5, 6, 1, 2},
						{4, 5, 6, 1, 2, 3},
						{5, 6, 1, 2, 3, 4},
						{6, 1, 2, 3, 4, 5} };
		Matrix solution = new Matrix(array.length);
		assertEquals(arr, solution.matrix(array));
	}
}


