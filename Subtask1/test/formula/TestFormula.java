package formula;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestFormula {
	Formula solution = new Formula();

	@Test
	public void tstFormula() {

		assertEquals(5.1839, solution.formula(5, 7), 0.01);
	}
	
	@Test
	public void tstNegative() {
		assertNotEquals(0, solution.formula(-11, 0));
	}

	@After
	public void tearDown() {
		solution = null;
	}

}
