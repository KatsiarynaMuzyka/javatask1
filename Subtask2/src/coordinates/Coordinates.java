package coordinates;

public class Coordinates {
	public boolean coordinates(int x, int y) {
		if ((((x >= -6 && x <= 6) && (y >= -3 && y <= 0))) 
				|| (((x >= -4 && x <= 4) && (y >= 0 && y <= 5)))) {
			return true;
		} else {
			return false;
		}
	}
}
