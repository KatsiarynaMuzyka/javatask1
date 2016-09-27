package numberSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumberSequence {
	NumberSequence numberSequence = new NumberSequence();
	
	@Test
	public void tstNumberSequence() {
		int array[] = { 3, 2, 5, 5, 4, 1, 6, -3, 7, 2, 12 };
		assertEquals(5, numberSequence.minCountNumber(array));
	}
	
	@Test
	public void tstNumberSequenceNegative() {
		int array[] = { 3, 2, 6, -3, 7, 2, 12 };
		assertNotEquals(5, numberSequence.minCountNumber(array));
	}

}
