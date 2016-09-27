package main;

import matrix.Matrix;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		Matrix solution = new Matrix(array.length);
		solution.matrix(array);
		System.out.println(solution);

	}

}
