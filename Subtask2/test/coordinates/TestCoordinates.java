package coordinates;

import static org.junit.Assert.*;
import org.junit.Test;
import coordinates.Coordinates;

public class TestCoordinates {
	Coordinates solution = new Coordinates();

	@Test
	public void tstCoordinates() {
		assertEquals(true, solution.coordinates(4, -2));
	}
	
	@Test
	public void tstNegative() {
		assertEquals(false, solution.coordinates(8, -2));
	}

}
