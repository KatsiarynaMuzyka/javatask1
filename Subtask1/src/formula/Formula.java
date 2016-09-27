package formula;

import java.lang.Math;

public class Formula {
	public double formula(int x, int y) {
		return ((1 + (Math.sin(x + y)) * (Math.sin(x + y))) 
				/ (2 + Math.abs(x - (2 * x / (1 + x * x * y * y)))) + x);
	}
}
